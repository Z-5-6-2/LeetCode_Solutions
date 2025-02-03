import java.util.*;

class Solution {
    public boolean isValid(String s) {
        Stack<Character> tab = new Stack<>();

        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                tab.push(c);
            } else {

                if (tab.isEmpty()) {
                    return false;
                }

                char top = tab.pop();
                if ((c == ')' && top != '(') ||
                    (c == '}' && top != '{') ||
                    (c == ']' && top != '[')) {
                    return false;
                }
            }
        }
        return tab.isEmpty();
    }
}

public class Main {

    public static final String RESET = "\u001B[0m";
    public static final String RED = "\u001B[31m";
    public static final String GREEN = "\u001B[32m";

    public static void main(String[] args) {

        Solution sol = new Solution();

        //testing: ()
        check(sol.isValid("()"),true);

        //testing: ()[]{}
        check(sol.isValid("()[]{}"),true);

        //testing: (]
        check(sol.isValid("(]"),false);

        //testing: ([])
        check(sol.isValid("([])"),true);

    }

    public static void check(boolean in,boolean ans){
        System.out.print("Is valid parentheses: "+in+", verdict: ");
        if(in == ans){
            System.out.println(GREEN + "correct" + RESET);
        }else{
            System.out.println(RED + "incorrect" + RESET);
        }

    }
}
