class Solution {
    public static String addBinary(String a, String b) {
        if (a == null || b == null) {
            return null;
        }

        int[] max;
        int[] min;

        if (a.length() > b.length()) {
            max = new int[a.length()];
            min = new int[a.length()];  

            for (int i = 0; i < a.length(); i++) {
                max[i] = a.charAt(i) - '0';  
            }

            for (int i = a.length() - 1, x = b.length() - 1; i >= 0; i--, x--) {
                if (x >= 0) {
                    min[i] = b.charAt(x) - '0';  
                } else {
                    min[i] = 0;   
                }
            }
        } else {
            max = new int[b.length()];
            min = new int[b.length()];  

            for (int i = 0; i < b.length(); i++) {
                max[i] = b.charAt(i) - '0';  
            }

            for (int i = b.length() - 1, x = a.length() - 1; i >= 0; i--, x--) {
                if (x >= 0) {
                    min[i] = a.charAt(x) - '0';  
                } else {
                    min[i] = 0;  
                }
            }
        }

        for(int i=0;i<max.length;i++){
            max[i]=max[i]+min[i];
        }

        for(int i=max.length-1;i>0;i--){
            if(max[i] > 1){
                max[i-1]=max[i-1]+1;
                max[i]=max[i]-2;
            }
        }

        if(max[0] == 2){
            max[0]=10;
        }

        if(max[0] == 3){
            max[0]=11;
        }

        String res="";

        for(int i=0;i<max.length;i++){
            res=res+String.valueOf(max[i]);
        }

        return res;
    }
}

public class Main{
    public static void main(String[] args) {
        String binary1="1010";
        String binary2="1011";
        System.out.println("Addition: "+binary1+" + "+binary2);
        System.out.println("Solution: "+Solution.addBinary(binary1, binary2));
    }
}