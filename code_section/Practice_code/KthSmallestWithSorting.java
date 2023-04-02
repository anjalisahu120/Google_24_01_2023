package Practice_code;

import java.util.Arrays;
import java.util.Scanner;

/*
    Time complexity : O(nlogn)
    Space complexity : O(1)
 */
public class KthSmallestWithSorting {
    public static void main(String[] args) {
        int[] arr = {3, 2, 9, 10, 11, 12, 6, 15, 20, 1};
        System.out.print("\nEnter the kth value  = ");
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();
        System.out.println("kth smallest element : "+ kthSmallestElement(arr,k));
    }

    private static int kthSmallestElement(int[] arr, int k) {
        Arrays.sort(arr);
        return arr[k-1];
    }
}
