package sortingtwomassive;
import com.example.Task;
import java.util.Arrays;

public class sortingtwomassivetask  implements Task{

    public void runTask() {
        int n = 5;
        int m = 5;
        int firstArray[] = {2,4,3,1,5};
        for (int i = 0; i < firstArray.length; i++){
//            firstArray[i] = (int)(Math.random() * 20);
            System.out.print(firstArray[i] + "  ");
        }
        System.out.println();

        bubbleSort(firstArray);
        for(int i = 0; i <  firstArray.length; i++) {
            System.out.print(firstArray[i] + "  ");
        }
        System.out.println();
        System.out.println();

        int secondArray[] =  {7,10,8,9,6};
        for (int i = 0; i < firstArray.length; i++){
//            secondArray[i] = (int)(Math.random() * 20);
            System.out.print(secondArray[i] + "  ");
        }

        System.out.println();

        bubbleSort(secondArray);
        for(int i = 0; i <  secondArray.length; i++) {
            System.out.print(secondArray[i] + "  ");
        }
        System.out.println();
        System.out.println();

        int bubbleArray[] = new int[n + m];
        for (int i = 0; i <bubbleArray.length/2; i++) {
            if (firstArray[i]>secondArray[i]) {
                bubbleArray[i+i] = secondArray[i];
                bubbleArray[i+i+1] = firstArray[i];
            } else {
                bubbleArray[i+i] = firstArray[i];
                bubbleArray[i+i+1] = secondArray[i];

            }



        }
        System.out.println(Arrays.toString(bubbleArray));

        System.out.println();





}

   static public void bubbleSort(int[] arr) {

       for(int i = arr.length-1; i > 0 ; i--){
            for(int j = 0 ; j < i ; j++){
                if( arr[j] > arr[j+1] ){
                    int tmp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tmp;
                }
            }
    }



    }
    public static int[] joinArrays(int[] first, int[] second) {
        if (first == null) {
            return second;
        }
        if (second == null) {
            return first;
        }
        int[] res = new int[first.length + second.length];

        System.arraycopy(first, 0, res, 0, first.length);
        System.arraycopy(second, 0, res, first.length, second.length);

        return res;
    }

}





