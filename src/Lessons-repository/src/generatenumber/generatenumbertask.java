package generatenumber;

import java.util.Arrays;
import java.util.Scanner;

import com.example.Task;


public class generatenumbertask implements Task {

    public int[] runTask () {
        Scanner sc = new Scanner(System.in);
        long n;
        do {
            System.out.println("Please enter the correct number");
            n = sc.nextLong();
        }
        while (!checkUserInput(n));
        if (checkUserInput(n)) {
            primes = new boolean[(int) n + 1];
            fillSieve();
            printPrimes();
        }

        return new int[0];
    }

    static boolean[] primes;

    static public boolean fillSieve() {
        Arrays.fill(primes, true);
        primes[0] = primes[1] = false;
        boolean p;

        for (int i = 2; i < primes.length - 1; i++) {
            if (primes[i]) {
                for (int j = i; i * j < primes.length - 1; j++) {
                    long indexForCheck = i * j;
                    if (indexForCheck < Integer.MAX_VALUE && indexForCheck >= 0) {
                        primes[i * j] = false;
                        p = primes[i * j];
                    }
                }
            }
        }
        return false;
    }

    static public void printPrimes() {
        for (int i = 1; i < primes.length - 1; i++) {
            if (primes[i]) {
                System.out.print(i + " ");
            }
        }
    }

    static public boolean checkUserInput(long userInput) {
        return (userInput > 0 && userInput < 2147483646);

    }
}
