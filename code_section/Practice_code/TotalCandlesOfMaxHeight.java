package Practice_code;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class TotalCandlesOfMaxHeight {

    public static void main(String[] args) {

        int arr[] = {3, 2,1,2,2,2 ,3, 3, 4};
        int value = birthdayCakeCandles(Arrays.stream(arr).boxed().collect(Collectors.toList()));
    }

    public static int birthdayCakeCandles(List<Integer> candles) {
        SortedMap<Integer, Integer> map = new TreeMap<>();
        System.out.println(candles);
        for (int i =0;i<candles.size();i++) {
            if (map.containsKey(candles.get(i))) {
                map.put(candles.get(i), map.get(candles.get(i)) + 1);
            } else {
                map.put(candles.get(i), 1);
            }
        }
        return map.get(map.lastKey());
    }
}
