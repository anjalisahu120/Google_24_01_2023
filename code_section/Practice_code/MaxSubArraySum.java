package Practice_code;

public class MaxSubArraySum {

    public static int maxSubArray(int[] nums) {
        int n = nums.length;
        int maximumSum = Integer.MIN_VALUE, currSumSubarray = 0;
        for (int i = 0; i < n; i++) {
            currSumSubarray += nums[i];
            maximumSum = Math.max(maximumSum, currSumSubarray);
            currSumSubarray = Math.max(currSumSubarray, 0);
        }
        return maximumSum;
    }

    public static void main(String[] args) {
        int nums[] = {-2,1,-3,4,-1,2,1,-5,4};
        maxSubArray(nums);
    }

}
