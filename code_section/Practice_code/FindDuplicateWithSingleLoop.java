package Practice_code;

import java.util.HashSet;

//Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.
public class FindDuplicateWithSingleLoop {

    public static void main(String[] args) {

        int[] arr = {1,2,3,4, 3};
        System.out.println(containsDuplicate(arr));
    }

    public static boolean containsDuplicate(int[] nums) {
        HashSet<Integer> hs = new HashSet<>();
        boolean val = false;
        for (int i : nums) {
            if (!hs.add(i)) { // if it's not adding element in hashset means that element already present in hashset and false saying not adding again to hashset
                val = true;
            }

//            if (hs.contains(i)) {
//                val = true;
//            } else {
//                hs.add(i);
//            }
        }
        return val;
    }
}
