package Practice_code;

import java.util.Arrays;
import java.util.Scanner;

public class TwoDArray {
    public static void main(String[] args) {
        int[][] arr = new int[3][3];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter values in 3*3 array");
        int n = arr.length;
        for (int i=0;i<n;i++)   {
            for (int j=0;j<n;j++)   {
                arr[i][j] = scanner.nextInt();
            }
        }

        System.out.println(getAbsoluteValueOfSumofBothDiagonals(arr, n));

    }

    private static int getAbsoluteValueOfSumofBothDiagonals(int[][] arr, int n) {
        int sumOfLeftToRightDiagonal = 0;
        int j;
        int sumOfRightToLeftDiagonal = 0;

        for (int i=0;i<n;i++)   {
            System.out.print(arr[i][i]+"  ");
            sumOfLeftToRightDiagonal += arr[i][i];

            j = n - i - 1 ;
            System.out.println(arr[i][j]);
            sumOfRightToLeftDiagonal += arr[i][j];

        }


        System.out.println("sumOfLeftToRightDiagonal : "+sumOfLeftToRightDiagonal );
        System.out.println("sumOfRightToLeftDiagonal : "+sumOfRightToLeftDiagonal);


        return Math.abs(sumOfLeftToRightDiagonal - sumOfRightToLeftDiagonal);
    }
}
