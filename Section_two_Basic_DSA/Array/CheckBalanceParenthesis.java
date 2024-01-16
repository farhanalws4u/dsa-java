import java.util.*;

public class CheckBalanceParenthesis {
    static boolean checkBalanced(String str) {

        Stack<Character> st = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            System.out.println(st);

            if (str.charAt(i) == '(') {
                st.push(str.charAt(i));
            } else {
                st.pop();
            }

        }

        if (st.isEmpty())
            return true;
        else
            return false;

    }

    public static void main(String args[]) {
        String str = "()(())()";
        System.out.println(checkBalanced(str));
    }
}
