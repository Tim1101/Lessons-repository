package CarRegister;

import com.example.Task;

import java.util.*;

public class carregistrationtask implements Task {
    public int[] runTask() {
        Persons();

        return new int[0];
    }



        public void Persons() {

            LinkedList<String> persons = new LinkedList<String>();
            persons.add(0, "Mike, A102BC, Nissan ");
            persons.add(1, "Alex, M283HE, BMW  ");
            persons.add(2, "Jack, O987AA, LADA ");
            persons.add(3, "Kate, T654EE, Jeep  ");
//        persons.remove(1);
            System.out.println(persons);
            Scanner sc = new Scanner(System.in);
            String cm;
            if(sc.hasNextInt()) {
                cm = sc.nextLine(); //
                System.out.println();
            }
//            Scanner sc = new Scanner(System.in);
//            String cm;
//            cm = sc.nextLine();
//            do {
//                persons.removeLast();
//            }
//            while (cm == persons.remove());






        }

    }












