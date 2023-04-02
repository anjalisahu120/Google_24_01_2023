package Practice_code;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

/*
    It is asked to find the kth smallest element in an array with sorting and without sorting

    Algorithm :
        We can use 'Set' data structure in this case as it stores the distinct element in sorted order
 */
public class KthSmallestWithoutSorting {

    public static void main(String[] args) {
        int[] arr = {3,2,9,10,11,12,6,15,20,1};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter kth value = ");
        int k = scanner.nextInt();
        System.out.println("kth value is : "+ kthSmallestElement(arr, k));
    }

    private static int kthSmallestElement(int[] arr, int k) {

        Set<Integer> set = new TreeSet<>();
        for (int i : arr)
            set.add(i);

        k--;
        Iterator<Integer> itr = set.iterator();
        while(k > 0) {
            itr.next();
            k--;
        }
        return itr.next();

    }
}
