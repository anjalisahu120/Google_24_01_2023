package Practice_code;

/* bcb#t

   bce#t

   bec#t

 */
public class BackSpace {

    public static void main(String[] args) {

        boolean isEqual = resolveStrings("bcb#t", "bce#t");
        System.out.println(isEqual);
    }

    private static boolean resolveStrings(String s1, String s2) {

        String s1AfterBackSpaceRemoval = "";
        String s2AfterBackSpaceRemoval = "";
        if (s1.length() == s2.length()) {
            for (int i=0;i<s1.length();i++) {

                if (s1.charAt(i) == '#') {
                  s1AfterBackSpaceRemoval  = new StringBuilder(s1).deleteCharAt(i).deleteCharAt(i-1).toString();
                }

                if (s2.charAt(i) == '#') {
                    s2AfterBackSpaceRemoval  = new StringBuilder(s2).deleteCharAt(i).deleteCharAt(i-1).toString();
                }
            }

            if (s1AfterBackSpaceRemoval.equals(s2AfterBackSpaceRemoval)) {
                return true;
            }
        }
       return false;
    }
}
