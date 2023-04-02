package Practice_code;

import java.math.BigInteger;

public class NthFibonacciNumber {

    static long mod = 1000000007;
    public static void main(String[] args) {

        int n1 = 656;
//        int ans1 = nthFactorialNumberForSmallNumbersRecursive(n1);
//        int ans2 = nthFibonacciNumberForSmallNumbersIterative(n1);
//        int ans2 = nthFibonacciNumberForSmallNumbersWithLessSpaceComplexity(n1);
//        long ans2 = nthFibonacciNumberForNumbersForBigNumber(n1);
//        long ans2 = nthFibonacciiForLargeNumberWithDP(n1);
        long ans2 = nthFib(n1);
        System.out.println("ans2 = "+ans2);
    }

    private static long nthFibonacciiForLargeNumberWithDP(long n1) {

        /* With Iterative method
        long[] arr = new long[(int)n1+1];
        arr[0] = 0;
        arr[1] = 1;
        for (int i=2;i<=n1;i++) {
            arr[i] = (arr[i-1]+arr[i-2])%mod;
        }
        //        return arr[(int)n1];
        */

        long a = 0, b = 1, c = 0;
        for (int i=2;i<=n1;i++) {
            c = (a+b)%mod;
            a = b;
            b = c;

        }
        return b;
    }

    private static int nthFibonacciNumberForSmallNumbersWithLessSpaceComplexity(int n1) {

        if (n1 <= 1) {
            return n1;
        }

        int a = 0, b = 1, c = 0;
        for (int i=2;i<=n1;i++) {
            c = a+b;
            a = b;
            b = c;
        }
        return b;
    }

    private static long nthFibonacciNumberForNumbersForBigNumber(long n1) {

        if (n1 <= 0) {
            return n1;
        }

        BigInteger a = BigInteger.valueOf(0);
        BigInteger b = BigInteger.valueOf(1);
        BigInteger c = BigInteger.valueOf(1);
        for (int i=2;i<=n1;i++) {
            c = a.add(b);
            a = b;
            b = c;
        }
        return b.longValue();
    }


    private static int nthFibonacciNumberForSmallNumbersRecursive(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("not valid input");
        }

        if (n <= 1) {
            return n;
        }

        return nthFibonacciNumberForSmallNumbersRecursive(n-1)+ nthFibonacciNumberForSmallNumbersRecursive(n-2);
    }

    private static int nthFibonacciNumberForSmallNumbersIterative(int n1) {
        if (n1 <= 1) {
            return n1;
        }

        int[] arr = new int[n1+1];
        arr[0] = 0;
        arr[1] = 1;
        for (int i=2;i<=n1;i++)  {
            arr[i] = arr[i-1]+arr[i-2];
        }
        return arr[n1];
    }


    private static long nthFib(long n) {

        long a = 0, b = 1, c =0;
        for (int i=0;i<n;i++) {
            c = (a+b)%mod;
            a = b;
            b = c;
        }
        return c;
    }
}

