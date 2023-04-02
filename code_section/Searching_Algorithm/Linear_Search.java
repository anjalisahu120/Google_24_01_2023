package Searching_Algorithm;

import java.util.Arrays;
import java.util.Scanner;

// To search the value linearly in array, the array is not required to be sorted before applying linear search, not optimal algo for searching
public class Linear_Search {

    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter size of an array  : " );
//        int size = scanner.nextInt();
//        int arr[] = new int[size];
//        System.out.println("Enter "+size+" elements in an array ");
//        for (int i =0;i<size;i++) {
//            arr[i] = scanner.nextInt();
//        }
//        System.out.println("Your array is : "+ Arrays.toString(arr));
//        System.out.print("\nEnter the value you wanna search : ");
//        int key = scanner.nextInt();
//        linearSearch(arr, key);

        int[] arr = {0,9,2,2,3,4, 77, 34, 23};
        System.out.println(findElementByLinearSearch(arr, 34));
    }

    private static void linearSearch(int[] arr,  int key) {

        int pos = 0;
        for (int i=0;i<arr.length; i++) {
            if (arr[i] == key) {
                pos = i;
            }
        }
        System.out.println(key+ " is found at "+ (pos+1));
    }


    private static int findElementByLinearSearch(int[] arr,int n) {
        int ans = 0;
        for (int i = 0; i<arr.length; i++) {
            if (arr[i] == n) {
                ans = i;
            }
        }
        return ans;
    }
}
