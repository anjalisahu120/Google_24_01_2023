package Practice_code;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MinMaxSum {

    public static void main(String[] args) {

        int[] arr =  {1,2,3,4,5};
        /*
        1+2+3+4 = 10 - min
        2+3+4+5 = 14 - max
        1+3+4+5 = 13
        1+2+4+5 = 12
        1+2+3+5 = 11
         */
//        getMinMax(Arrays.stream(arr).boxed().collect(Collectors.toList()));
        getMinMaxoptimized(Arrays.stream(arr).boxed().collect(Collectors.toList()));
//        System.out.println(Arrays.toString(ans));
    }

    private static void getMinMaxoptimized(List<Integer> list) {
        int sum = 0;
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
        for (int num : list) {
            sum += num;
            min = Math.min(min, num);
            max = Math.max(max, num);
        }

        long minSum = sum - max;
        long maxSum = sum - min;
        System.out.print(minSum+" "+maxSum);
    }

    private static void getMinMax(List<Integer> arr) {
            int n = arr.size();
            int[] ans = new int[n];
            int sum=0;
            for (int i=0;i< n;i++)  {
                for (int j = 0; j<n; j++) {
                    if (i != j) {
                        sum += arr.get(j);
                    }
                }
                ans[i] = sum;
                sum = 0;
            }
            Arrays.sort(ans);
            System.out.print(ans[0]+" "+ans[ans.length-1]);
        }
}
