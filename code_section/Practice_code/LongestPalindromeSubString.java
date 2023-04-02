package Practice_code;

public class LongestPalindromeSubString {
    public static void main(String[] args) {

        String input = "abcdcab";
        System.out.println(resolveString(input));
    }

    private static boolean resolveString(String input) {

        String test = "";
        boolean isOk = false;
        boolean isExisit = false;
        for (Character ch : input.toCharArray()) {
            String current = String.valueOf(ch);
            test = test+current;
            isOk =  isPalindrome(test);

            if (isOk) {
                isExisit = true;
                System.out.println(test);
                break;
            }
        }
        return isExisit;
    }

    private static boolean isPalindrome(String input) {

        String palin = "";
        for (int i=input.length()-1; i >= 0;i--) {
            palin = palin+input.charAt(i);
        }
        if (palin.equals(input)) {
            return true;
        }
        return false;
    }
}
