package invertnumber;
import com.example.Task;


public class invertnumbertask  implements  Task {

    public int[] runTask() {
        int num = 12345;
        int invertnum = 0;
        while (num != 0) {
            invertnum = invertnum * 10 + (num % 10);
            num = num / 10;
            num = num + 1;

        }
        System.out.println(invertnum);
        return new int[0];
    }
}
