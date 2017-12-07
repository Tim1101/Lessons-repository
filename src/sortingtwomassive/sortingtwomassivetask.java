package sortingtwomassive;
import com.example.Task;
import java.util.Arrays;

public class sortingtwomassivetask  implements Task{

    public void runTask() {
        int n = 5;
        int m = 5;
        int firstArray[] = {4, 3, 9, 2, 10};
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

        int secondArray[] =  {5, 8, 1, 6, 7};
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
        int i = 0;
        int j = 0;
        int index = 0;

        while ( i < n &&  j > m){
            if ( firstArray[i] > secondArray[i]){
                bubbleArray[index] = firstArray[i];
                i++;
            }
            else {
                bubbleArray[index] = secondArray[j];
                j++;
            }
            while (i < n){
                bubbleArray[index] = firstArray[i];
                index++;
                i++;
            }
            while (j < m) {
                bubbleArray[index] = secondArray[i];
                index++;
                j++;
            }
             for (int k = 0; k < n + m; k++){
                System.out.print(bubbleArray[k] + "  ");
             }

        }



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





