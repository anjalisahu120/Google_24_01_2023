package Practice_code;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Frequency {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nEnter string : ");
        String input = scanner.nextLine();
        frequency(input);
    }

    private static void frequency(String input) {
        Map<Character, Integer> map = new HashMap<>();
        for (char ch : input.toCharArray()) {
            if (map.containsKey(ch)) {
                map.put(ch, map.get(ch)+1);
            } else {
                map.put(ch, 1);
            }
        }
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " : "+entry.getValue());
        }
    }
}
