package Practice_code;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RatioOfElements {

    public static void main(String[] args) {
        int[] arr = {1,1, 0, -1, -1};

        getRatioOfElements(arr);
    }

    private static void getRatioOfElements(int[] arr) {
        int totalPositiveElements = 0;
        int totalNegativeElements = 0;
        int totalZeros = 0;
        int n = arr.length;
        for (int i=0;i<n;i++) {
            if (arr[i] == 0) {
                totalZeros++;
            }

            if (arr[i] < 0) {
                totalNegativeElements++;
            }

            if (arr[i] > 0) {
                totalPositiveElements++;
            }
        }

        BigDecimal ratioOfZeros = getRatio(totalZeros, n);
        BigDecimal ratioOfPositives = getRatio(totalPositiveElements, n);
        BigDecimal ratioOfNegatives = getRatio(totalNegativeElements, n);

        System.out.println(ratioOfPositives);
        System.out.println(ratioOfNegatives);
        System.out.println(ratioOfZeros);
    }

    private static BigDecimal getRatio(int numerator, int denominator) {
        return new BigDecimal(numerator).divide(new BigDecimal(denominator), 6, BigDecimal.ROUND_HALF_UP);
    }
}
