class Solution {
    public boolean isMatch(String s, String p) {
        if (s == null || p == null) {
            return false;
        }

        boolean[][] sam = new boolean[s.length() + 1][p.length() + 1];
        sam[0][0] = true;

        for (int j = 1; j < p.length(); j++) {
            if (p.charAt(j) == '*') {
                sam[0][j + 1] = sam[0][j - 1];
            }
        }

        for (int i = 0; i < s.length(); i++) {
            for (int j = 0; j < p.length(); j++) {
                if (p.charAt(j) == '.' || p.charAt(j) == s.charAt(i)) {
                    sam[i + 1][j + 1] = sam[i][j];
                } else if (p.charAt(j) == '*') {
                    if (p.charAt(j - 1) != s.charAt(i) && p.charAt(j - 1) != '.') {
                        sam[i + 1][j + 1] = sam[i + 1][j - 1];
                    } else {
                        sam[i + 1][j + 1] = sam[i + 1][j] || sam[i + 1][j - 1] || sam[i][j + 1];
                    }
                }
            }
        }

        return sam[s.length()][p.length()];
    }
}

public class Main {
    public static final String RESET = "\u001B[0m";
    public static final String RED = "\u001B[31m";
    public static final String GREEN = "\u001B[32m";

    public static void main(String[] args) {
        Solution sol=new Solution();

        check(sol.isMatch("aa","a"),false);

        check(sol.isMatch("aa","a*"),true);

        check(sol.isMatch("ab",".*"),true);
    }

    public static void check(boolean in,boolean ans){
        System.out.print("Is match: "+in+", verdict: ");
        if(in == ans){
            System.out.println(GREEN + "correct" + RESET);
        }else{
            System.out.println(RED + "incorrect" + RESET);
        }

    }
}
