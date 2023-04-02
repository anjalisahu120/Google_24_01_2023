package Practice_code;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {

    public static void main(String[] args) {
//        int arr[] = {1,2,3, 4,3, 5,9};
        int[] arr = {1,2,3,3,11,9,8, 6,14};
        int target = 13;
        int[] arr3 = getTwoIndices2(arr, target);
        System.out.println(Arrays.toString(arr3));

    }

    private static int[] getTwoIndices1(int[] arr, int target) {
        int[] ans = new int[2];
        for (int i=0;i<arr.length;i++) {
            for (int j=i+1;j<arr.length;j++) {
                int sum = arr[i] + arr[j];
                if (sum == target) {
                    ans[0] = i;
                    ans[1] = j;
                }
            }
        }
        return ans;
    }

    private static int[] getTwoIndices2(int[] arr, int target) {
        int[] ans = new int[2];
        // target = arr[i] + arr[j] ---> without using another loop for j --> calculate arr[j] = target - arr[j]; --> map.get(arr[j]) // index of j;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i=0;i<arr.length;i++) {
            Integer diff = target - arr[i];
            if (map.containsKey(diff)) {
                ans[0] = map.get(diff);
                ans[1] = i;
            } else {
                map.put(arr[i], i);
            }
        }
        return ans;
    }


}
