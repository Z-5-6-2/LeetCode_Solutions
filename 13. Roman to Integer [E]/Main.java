class Solution {
    public int romanToInt(String s) {
        int fin=0;
        for(int i=0; i<s.length(); i++){
            char first= s.charAt(i);
            char sec = '0';

            if(i+1 < s.length()){
                sec= s.charAt(i+1);
            }

            if(first == 'I' && sec == 'V')
            {
                fin = fin +4;
                i++;
            }else if(first == 'I' && sec == 'X')
            {
                fin = fin +9;
                i++;
            }else if(first == 'X' && sec == 'L')
            {
                fin = fin +40;
                i++;
            }else if(first == 'X' && sec == 'C')
            {
                fin = fin +90;
                i++;
            }else if(first == 'C' && sec == 'D')
            {
                fin = fin +400;
                i++;
            }else if(first == 'C' && sec == 'M'){
                fin = fin +900;
                i++;
            }else{

                if (first == 'I')   
                    fin=fin+ 1;   
                if (first == 'V')   
                    fin=fin+ 5;   
                if (first == 'X')   
                    fin=fin+ 10;   
                if (first == 'L')   
                    fin=fin+ 50;   
                if (first == 'C')   
                    fin=fin+ 100;   
                if (first == 'D')   
                    fin=fin+ 500;   
                if (first == 'M')   
                    fin=fin+ 1000;

            }

        }

        return fin;
    }
}

public class Main{

    public static final String RESET = "\u001B[0m";
    public static final String RED = "\u001B[31m";
    public static final String GREEN = "\u001B[32m";

    public static void main(String[] args) {
        Solution sol = new Solution();

        //testing: III
        check(sol.romanToInt("III"),3);

        //testing: LVIII
        check(sol.romanToInt("LVIII"),58);

        //testing: MCMXCIV
        check(sol.romanToInt("MCMXCIV"),1994);
    }

    public static void check(int in,int ans){
        System.out.print("Integer: "+in+", verdict: ");
        if(in == ans){
            System.out.println(GREEN + "correct" + RESET);
        }else{
            System.out.println(RED + "incorrect" + RESET);
        }

    }
}