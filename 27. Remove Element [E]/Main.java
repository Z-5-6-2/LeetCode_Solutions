import java.util.*;

class Solution {
    public int removeElement(int[] nums, int val) {
        int k=0;
        int [] arr =new int[nums.length];
        
        for(int i=0;i<nums.length;i++){
            if(nums[i]!= val){
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
    public static void main(String[] args) {
        Solution sol= new Solution();

        //test case 1
        int[] nums={3,2,2,3};
        int k=sol.removeElement(nums, 3);
        System.out.println("1. Number of elements remaining: "+ k + " ,Array: " + Arrays.toString(Arrays.copyOfRange(nums,0,k)));

        //test case 2
        int[] nums2={0,1,2,2,3,0,4,2};
        int k2=sol.removeElement(nums2, 2);
        System.out.println("2. Number of elements remaining: "+ k2 + " ,Array: " + Arrays.toString(Arrays.copyOfRange(nums2,0,k2)));
    }
}
