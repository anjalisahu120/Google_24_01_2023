package Practice_code;

// Length of the longest substring without repeating characters

public class LongestSubstringWithoutRepeat {
    public static void main(String[] args) {

        String s = "mississippi";
        int length = longestSubstringWithoutRepeat(s);
        System.out.println(length);
    }

    private static int longestSubstringWithoutRepeat(String str) {

        String test = "";
        int maxLength = -1;
        if (str.isEmpty()) {
            return 0;
        }
        else if (str.length() == 1) {
            return 1;
        }
        for (char c : str.toCharArray()) {
            String current = String.valueOf(c);

            // If string already contains the character
            // Then substring after repeating character
            if (test.contains(current)) {
                test = test.substring(test.indexOf(current)
                        + 1);
            }
            test = test + c;
            maxLength = Math.max(test.length(), maxLength);
        }

        return maxLength;
    }
}
