package org.vs.data.structures.sorting;


import static org.vs.data.structures.sorting.CommonUtil.printArray;
import static org.vs.data.structures.sorting.CommonUtil.swap;

public class InsertionSort {

    public static void main(String[] args) {
        int[] arr = {21, 8, 5, 9, 12, 4, 3, 13, 17, 14, 4, 5};
        int size = arr.length;
        int j = 0;
        int current = 0;

        for (int i = 0; i < size - 1; i++) {
            j = i + 1;
            current = arr[j];

            while (j > 0 && current < arr[j - 1]) {
                swap(arr, j - 1, j);
                current = arr[j - 1];
                j--;
            }
            printArray(arr);
        }


        System.out.println("final::");
        printArray(arr);
    }


}
