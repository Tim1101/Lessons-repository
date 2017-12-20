package sortingtwomassive;
import com.example.Task;

public class sortingtwomassivetask  implements Task{

    public int[] runTask() {

        int firstArray[] = {1, 1, 2, 2, 6, 6, 8, 8};
        for (int i = 0; i < firstArray.length; i++) {
            //firstArray[i] = (int)(Math.random() * 20);
            System.out.print(firstArray[i] + "  ");
        }
        System.out.println();

        bubbleSort(firstArray);
        for (int i = 0; i < firstArray.length; i++) {
            System.out.print(firstArray[i] + "  ");
        }
        System.out.println();
        System.out.println();

        int secondArray[] = {1, 4, 4, 5, 5, 5, 5, 9};
        for (int i = 0; i < firstArray.length; i++) {
            //secondArray[i] = (int)(Math.random() * 20);
            System.out.print(secondArray[i] + "  ");
        }

        System.out.println();

        bubbleSort(secondArray);
        for (int i = 0; i < secondArray.length; i++) {
            System.out.print(secondArray[i] + "  ");
        }
        System.out.println();
        System.out.println();


        int bubbleArray[] = new int[firstArray.length + secondArray.length];
        int i = 0;
        int j = 0;
        int index = 0;

        while (i < firstArray.length && j < secondArray.length) {
            if (firstArray[i] < secondArray[j]) {
                bubbleArray[index] = firstArray[i];
                i++;
            } else {
                bubbleArray[index] = secondArray[j];
                j++;
            }
            index++;
        }
        while (i < firstArray.length) {
            bubbleArray[index] = firstArray[i];
            i++;
            index++;
        }
        while (j < secondArray.length) {
            bubbleArray[index] = secondArray[j];
            j++;
            index++;
        }

        for (int p = 0; p < bubbleArray.length; p++){
            System.out.print(bubbleArray[p]+ "  ");
        }

        return bubbleArray;

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





