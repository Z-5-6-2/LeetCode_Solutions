class Solution {
    public boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }
        
        String s1=Integer.toString(x);
        String s2="";

        for(int i=0;i<s1.length();i++){
            char be=s1.charAt(i);
            s2=be+s2;
        }

        for(int i=0;i<s1.length();i++){
            if(s1.charAt(i)!=s2.charAt(i)){
                return false;
            }
        }

        return true;
    }
}

public class Main {
    public static final String RESET = "\u001B[0m";
    public static final String RED = "\u001B[31m";
    public static final String GREEN = "\u001B[32m";
    public static void main(String[] args) {
        Solution sol=new Solution();

        //testing: 121
        check(sol.isPalindrome(121),true);

        //testing: -121
        check(sol.isPalindrome(-121),false);

        //testing: 10
        check(sol.isPalindrome(10),false);
        
    }

    public static void check(boolean in, boolean ans){
        System.out.print("Is palindrome: " + in +", ");
        if(in == ans){
            System.out.println(GREEN + "correct" + RESET);
        }else{
            System.out.println(RED + "incorrect" + RESET);
        }
    }
}
