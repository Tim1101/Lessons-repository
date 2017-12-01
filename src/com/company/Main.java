package com.company;

public class Main {

    private static void printArray(int[][] arrayForPrint) {
        for (int i = 0; i < arrayForPrint.length; i++) {
            for (int j = 0; j < arrayForPrint.length; j++) {
                System.out.print(arrayForPrint[i][j] + "\t");
            }
            System.out.println();
        }
    }

    private static int[][] generateArray(int size) {
        int[][] outputArray = new int[size][size];
        int k = 1;
            for (int i = 0; i < outputArray.length; i++) {
                for (int j = 0; j < outputArray.length; j++) {
                    outputArray[i][j] = k;
                    k++;
                }
            }

        return outputArray;
    }

    public static void main(String[] args) {
        int[][] array = generateArray(4);
        int arrayHalfLength = (array.length)/2 ;
        printArray(array);

        System.out.println();

        int[][] bubbleArray = new int[array.length][array[0].length];

        if ((array.length)%2 == 0  ) {
            for (int i = 0; i < bubbleArray.length; i++) {
                for (int j = 0; j < bubbleArray.length; j++) {
                    if (i < arrayHalfLength && j < arrayHalfLength) {
                        bubbleArray[i][j + arrayHalfLength] = array[i][j];
                    }
                    if (i < arrayHalfLength && j >= arrayHalfLength) {
                        bubbleArray[i + arrayHalfLength][j] = array[i][j];
                    }
                    if (i >= arrayHalfLength && j >= arrayHalfLength) {
                        bubbleArray[i][j - arrayHalfLength] = array[i][j];
                    }
                    if (i >= arrayHalfLength && j < arrayHalfLength) {
                        bubbleArray[i - arrayHalfLength][j] = array[i][j];
                    }
                }

            }
        } else {
            for (int i = 0; i < bubbleArray.length; i++){
                for (int j = 0; j < bubbleArray.length; j++) {

                   if ( i == arrayHalfLength  || j == arrayHalfLength  ) {
                       bubbleArray[i][j] = array[i][j];
                   }


                    if (i < arrayHalfLength && j < arrayHalfLength) {
                        bubbleArray[i][j + arrayHalfLength + 1] = array[i][j];
                    }
                    if (i < arrayHalfLength && j > arrayHalfLength) {
                        bubbleArray[i + arrayHalfLength + 1][j] = array[i][j];
                    }
                    if (i > arrayHalfLength && j > arrayHalfLength) {
                        bubbleArray[i][j - arrayHalfLength - 1] = array[i][j];
                    }
                    if (i > arrayHalfLength && j < arrayHalfLength) {
                        bubbleArray[i - arrayHalfLength - 1][j] = array[i][j];
                    }


                }
            }
        }
            printArray(bubbleArray);
    }

}
