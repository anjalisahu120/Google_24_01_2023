package Practice_code;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class NonRepeatingElements {

    public static void main(String[] args) {
        int[] arr = {11, 1, 4, 7, 4, 2, 23, 1, 3, 1, 10, 9, 11, 2, 2, 2, 3, 4, 7, 9, 10 , 10, 4};
//        nonRepeatingElement(arr);
//        nonRepeatingElementWithSorting(arr);
        nonRepeatingElementWithoutSorting(arr);
    }

    private static void nonRepeatingElementWithoutSorting(int[] arr) {

        Map<Integer, Integer> map = new HashMap<>();
        for (int i=0;i<=arr.length;i++) {
            if (map.containsKey(arr[i])) {
                map.put(arr[i], map.get(arr[i])+1);
            } else {
                map.put(arr[i], 1);
            }
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1)  {
                System.out.println(entry.getKey());
            }
        }
    }

    private static void nonRepeatingElementWithSorting(int[] arr) {

        Arrays.sort(arr);
        List<Integer> list = new ArrayList<>();
        for (int i = 0;i < arr.length;i = i+2) {
            if (arr[i] != arr[i+1]) {
                list.add(arr[i]);
                i = i - 1;
            }
        }

        if (list.size()  == 1) {
            list.add(arr[arr.length-1]);
        }
        System.out.println(list);
    }

//    private static void nonRepeatingElement(int[] arr) {
//
//        Map<Integer, Integer> map = new HashMap<>();
//        for (int i : arr) {
//            if (map.containsKey(i)) {
//                map.put(i, map.get(i)+1);
//            } else {
//                map.put(i, 1);
//            }
//        }
//
//        System.out.print("\nnon repeating element(s) : ");
//        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
//            if (entry.getValue() ==  1) {
//                System.out.print(entry.getKey()+ "   ");
//            }
//        }
//    }
}
