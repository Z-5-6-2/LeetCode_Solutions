import java.util.Arrays;

class Solution {
    public static void merge(int[] num1, int m, int[] num2, int n) {

        for(int i=0,x=num1.length-1;i<n;i++,x--){
            num1[x]=num2[i];
        }

        for(int i=1;i<num1.length;i++){
            if(num1[i-1]>num1[i]){
                int temp=num1[i-1];
                num1[i-1]=num1[i];
                num1[i]=temp;
                i=0;
            }
        }
    }
}

public class Main{
    public static void main(String[] args) {
        int []num1={1,2,3,0,0,0};
        int []num2={2,5,6};
        int m=3,n=3;

        Solution.merge(num1, m, num2, n);

        System.out.println(Arrays.toString(num1));
    }
}