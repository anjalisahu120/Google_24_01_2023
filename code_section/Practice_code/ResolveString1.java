package Practice_code;

// Anjali ==> Ilajna
public class ResolveString1 {
    public static void main(String[] args) {

        String input = "Anjali";
        System.out.println(resolveString(input));
    }

    private static String resolveString(String input) {
        String small = input.toLowerCase(); // anjali
        String ans = "";
        for (int i=0;i<input.length();i++) {
            String sb = new StringBuilder(small).reverse().toString(); // ilajna
            ans = sb.substring(0,1).toUpperCase()+sb.substring(1);
        }
        return ans;
    }
}
