class Solution {
    public static int mySqrt(int x) {
        int count=0;
        int odd=1;
        while(x>0){
            count++;
            x = x - odd;
            odd = odd + 2;
        }

        if(x<0){
            count=count-1;
        }

        return count;
    }
}

public class Main{
    public static void main(String[] args) {
        int x=4;
        System.out.println("Value(x): "+x+"\nSqrt(x): "+Solution.mySqrt(x));
    }
}