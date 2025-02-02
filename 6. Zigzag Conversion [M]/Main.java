class Solution {
    public String convert(String s, int numRows) {
        int sl=s.length();
        char[][]zz=new char [numRows][sl];

        int c=0;
        while(s.length()!=0){
            for(int r=0;r<numRows;r++){
                zz[r][c]=s.charAt(0);
                s=s.substring(1);
                if(s.length()==0){
                    break;
                }
            }

            if(s.length()==0){
                break;
            }

            for(int i=numRows-2;i>0;i--){
                c++;
                zz[i][c]=s.charAt(0);
                s=s.substring(1);
                if(s.length()==0){
                    break;
                }
                
            }
            c++;
        }

        String fin="";

        for(int i=0;i<numRows;i++){
            for(int r=0;r<sl;r++){
                if(zz[i][r]!='\u0000'){
                    fin=fin+zz[i][r];
                }
            }
        }

        return fin;
    }
}

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String s="PAYPALISHIRING";
        int numRows=3;
        String sol=solution.convert(s, numRows);
        System.out.println("ZigZag solution: "+sol);
        
    }
}
