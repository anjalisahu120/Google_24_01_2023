package Practice_code;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TimeConversion {
    public static void main(String[] args) {

        // 07:05:45PM
        // 19:05:45
        System.out.println(getTimeCOnversion());
    }

    private static String getTimeCOnversion() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter time considering 12 hours timeline : ");
        String input = scanner.nextLine();
        Map<String, String> map = new HashMap<>();
        map.put("01", "13");
        map.put("02", "14");
        map.put("03", "15");
        map.put("04", "16");
        map.put("05", "17");
        map.put("06", "18");
        map.put("07", "19");
        map.put("08", "20");
        map.put("09", "21");
        map.put("10", "22");
        map.put("11", "23");
        map.put("12", "12");
        String output = null;
        if (input.contains("PM")) {
            String hour = input.substring(0,2);
            output = map.get(hour)+input.substring(2, 8);
        } else if (input.contains("AM")) {
            String first = input.substring(0,2);
            if (first.equals("12")) {
                output =  "00"+input.substring(2, 8);
            } else {
                output = new StringBuilder(input).deleteCharAt(input.length()-1).deleteCharAt(input.length()-2).toString();
            }
        }
        return output;
    }
}
