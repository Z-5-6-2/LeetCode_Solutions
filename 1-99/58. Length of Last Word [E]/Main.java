class Solution {
    public static int lengthOfLastWord(String s) {
        s=s.trim();
        int fin=0;

        for(int i=s.length()-1;i>=0;i--){
            if(s.charAt(i) == ' '){
                break;
            }
            fin++;
        }

        return fin;
    }
}

public class Main{
    public static void main(String[] args) {
        String s="Hello World";
        System.out.println(Solution.lengthOfLastWord(s));
    }
}