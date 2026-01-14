class Solution {
    public String longestCommonPrefix(String[] strs) {
        String prefix="";

        if(strs.length==0)return prefix;
        if(strs.length==1)return strs[0];

        int shst=strs[0].length();
        for(int i=0;i<strs.length;i++){
            if(strs[i].length()<shst){
                shst=strs[i].length();
            }
        }

        for(int i=0;i<shst;i++){
            for(int n=0;n+1<strs.length;n++){
                if(strs[n].charAt(i)!=strs[n+1].charAt(i)){
                    return prefix;
                }
            }
            prefix=prefix+strs[0].charAt(i);
        }

        return prefix;

    }
}

public class Main {

    public static final String RESET = "\u001B[0m";
    public static final String RED = "\u001B[31m";
    public static final String GREEN = "\u001B[32m";
    public static void main(String[] args) {
        Solution sol = new Solution();

        //testing: ["flower","flow","flight"]
        check(sol.longestCommonPrefix(new String[]{"flower","flow","flight"}),"fl");

        //testing: ["dog","racecar","car"]
        check(sol.longestCommonPrefix(new String[]{"dog","racecar","car"}),"");

    }

    public static void check(String in,String ans){
        System.out.print("Longest Common Prefix: "+in+", verdict: ");
        if(in.equals(ans)){
            System.out.println(GREEN + "correct" + RESET);
        }else{
            System.out.println(RED + "incorrect" + RESET);
        }

    }
}
