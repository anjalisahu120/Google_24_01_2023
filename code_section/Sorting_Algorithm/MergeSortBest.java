package Sorting_Algorithm;

import java.util.Arrays;

public class MergeSortBest {

    public static void main(String[] args) {
        int[] arr = {38, 27, 43, 3, 9, 82, 10};
        mergeSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void mergeSort(int[] arr) {
        if (arr == null || arr.length == 0) {
            return;
        }
        int[] temp = new int[arr.length];
        mergeSort(arr, temp, 0, arr.length - 1);
    }

    public static void mergeSort(int[] arr, int[] temp, int left, int right) {
        if (left < right) {
//            int mid = left + (right - left) / 2;
            int mid = (left + right)/2;
            mergeSort(arr, temp, left, mid);
            mergeSort(arr, temp, mid + 1, right);
            merge(arr, temp, left, mid, right);
        }
    }

    public static void merge(int[] arr, int[] temp, int left, int mid, int right) {
        for (int i = left; i <= right; i++) {
            temp[i] = arr[i];
        }
        int i = left;
        int j = mid + 1;
        int k = left;
        while (i <= mid && j <= right) {
            if (temp[i] <= temp[j]) {
                arr[k] = temp[i];
                i++;
            } else {
                arr[k] = temp[j];
                j++;
            }
            k++;
        }
        while (i <= mid) {
            arr[k] = temp[i];
            k++;
            i++;
        }
    }
}
