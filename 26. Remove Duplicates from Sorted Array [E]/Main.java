import java.util.Arrays;

class Solution {
    public int removeDuplicates(int[] nums) {
        int []arr=new int[nums.length];
        int k=0;
        for(int i=0;i<nums.length;i++){
            boolean test=false;
            for(int n=0;n<k;n++){
                if(arr[n]==nums[i]){
                    test=true;
                }
            }
            if(test==false){
                arr[k]=nums[i];
                k++;
            }
        }

        for(int i=0;i<k;i++){
            nums[i]=arr[i];
        }
       
        return k;
    }
}

public class Main {

    public static final String RESET = "\u001B[0m";
    public static final String RED = "\u001B[31m";
    public static final String GREEN = "\u001B[32m";
    
    public static void main(String[] args) {
        Solution sol = new Solution ();
        
        //test 1
        int[] nums={1,1,2};
        int un=sol.removeDuplicates(nums);
        System.out.println("1. Number of unique numbers: "+ un +" ,Array: "+Arrays.toString(Arrays.copyOfRange(nums,0,un)));

        //test 2
        int[] nums2={0,0,1,1,1,2,2,3,3,4};
        int un2=sol.removeDuplicates(nums2);
        System.out.println("2. Number of unique numbers: "+ un2 +" ,Array: "+Arrays.toString(Arrays.copyOfRange(nums2,0,un2)));
        
    }
}
