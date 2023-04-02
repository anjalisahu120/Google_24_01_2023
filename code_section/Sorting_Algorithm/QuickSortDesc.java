package Sorting_Algorithm;

import java.util.Arrays;

public class QuickSortDesc {

    public static void main(String[] args) {

        int[] arr = {22,23,45,1,255,67,2,4,5,7,11,67,9,10,6};
        quickSort(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    private static void quickSort(int arr[], int left, int right) {
        if (left < right) {
            int pivot = partition(arr, left, right);
            quickSort(arr, left, pivot - 1);
            quickSort(arr, pivot + 1, right);
        }
    }

    private static int partition(int[] arr, int left, int right) {
        int pivot = arr[right];
        int i = left - 1;
        for (int j = left; j< right;j++) {
            if (arr[j] > pivot) {
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i+1, right);
        return i+1;
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
