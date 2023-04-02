package Sorting_Algorithm;

import java.util.Arrays;

public class BubbleSortAlgorithm {

    public static void main(String[] args) {

        int[] arr = {38, 27, 3, 8, 9, 82, 43, 10};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void bubbleSort(int[] arr) {
        if (arr == null || arr.length == 0)
            return;

        bubblesort(arr);
    }

    public static void bubblesort(int[] arr) {

        // Since in each pass we are putting the largest value at last example so we can skip checking the last one in inner loop with each increment of i in outer loop
        boolean swapped;
        for (int i=0;i<arr.length;i++) {
            swapped = false;
            for (int j=0;j< arr.length - 1 - i;j++) {  // hensce j < arr.length - 1 - i
                if (arr[j] > arr[j+1]) {
                    swap(arr, j, j+1);
                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
        }
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
