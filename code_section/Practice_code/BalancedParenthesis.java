package Practice_code;

public class BalancedParenthesis {

    public static void main(String[] args) {

        String input = "(((jshgd)({}{}{{{}}}swihe(*#&";
        String s = balancedParenthesis(input);
        System.out.println(s);
    }

    private static String balancedParenthesis(String input) {

        String output = input.replaceAll("[{}()]","");
        return output;
    }
}
