package Searching_Algorithm;

import java.util.Arrays;
import java.util.Scanner;

/* Prerequisite : Array must be sorted.
   Algorithm : 1. Find the middle element
               2. Compare the middle element with the key/target value
               3. If arr[mid] > key then find new h = mid - 1;
               4. If arr[mid] < key then find new h =  mid + 1;
               5. If arr[mid] == key then print mid
               6. step 1.

 */
public class Binary_search {
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
//        binarySearch(arr, 0, size-1, key);


        int[] arr= {11, 13, 23, 45, 67, 100, 90, 234, 235, 236, 289, 299, 1, 304, 306, 12, 311, 314};
        int key = 306;
        findByBinarySearch( arr , 0, arr.length-1 ,key);
    }

    private static void binarySearch(int[] arr, int l, int h, int key) {

        int mid = (l+h)/2;
        while (l <= h) {
            if (arr[mid] == key) {
                System.out.println(key+ " is found at "+(mid+1)+" position in an array");
                break;
            } else if (arr[mid] < key) {
                l = mid + 1;
            } else if (arr[mid] > key) {
                h = mid - 1;
            }
            mid = (l+h)/2;
        }
    }

    public static void findByBinarySearch(int[] arr, int l, int h, int n) {

        Arrays.sort(arr);
        int mid = (l + h)/2;
        while (l <= h) {
            if (arr[mid] == n) {
                System.out.println(n+ " is at "+ (mid+1));
                break;
            } else if (arr[mid] < n) {
                l = mid + 1;
            } else if (arr[mid] > n) {
                h = mid - 1;
            }

            mid = (l + h) / 2;
        }


    }
}
