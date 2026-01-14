class Solution {
    public int strStr(String haystack, String needle) {
        return haystack.indexOf(needle);

    }
}

class Main{

    public static final String RESET = "\u001B[0m";
    public static final String RED = "\u001B[31m";
    public static final String GREEN = "\u001B[32m";

    public static void main(String[] args) {
        Solution sol = new Solution();

        check(sol.strStr("sadbutsad", "sad"),0); //test 1
        check(sol.strStr("leetcode", "leeto"),-1); //test 2
    }

    public static void check(int in,int ans){
        System.out.print("Index: "+in+", verdict: ");
        if(in == ans){
            System.out.println(GREEN + "correct" + RESET);
        }else{
            System.out.println(RED + "incorrect" + RESET);
        }

    }
}