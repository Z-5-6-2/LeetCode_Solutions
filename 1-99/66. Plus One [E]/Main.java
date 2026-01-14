import java.math.BigInteger;
import java.util.Arrays;

class Solution {
    public static int[] plusOne(int[] digits) {
        String n="";
        for(int i=0;i<digits.length;i++){
            n=n+digits[i];
        }
        BigInteger nn=new BigInteger(n);
        BigInteger pl=new BigInteger("1");
        nn=nn.add(pl);
        String ss=nn.toString();

        int [] all=new int[ss.length()];
        for(int i=0;i<ss.length();i++){
            all[i] = ss.charAt(i)-'0';
        }

        return all;

    }
}

public class Main{
    public static void main(String[] args) {
        int []arr={4,3,2,1};
        System.out.println("Original: "+Arrays.toString(arr)+"\nPlus One: "+Arrays.toString(Solution.plusOne(arr)));
    }
}