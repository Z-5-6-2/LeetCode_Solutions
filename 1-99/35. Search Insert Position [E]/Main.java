class Solution {
    public int searchInsert(int[] nums, int target) {
        int pred=0;

        for(int i=0;i<nums.length;i++){
            if(nums[i]<target){
                pred=i+1;
            }

            if(nums[i]==target){
                return i;
            }
        }

        return pred;
    }
}

class Main{

    public static final String RESET = "\u001B[0m";
    public static final String RED = "\u001B[31m";
    public static final String GREEN = "\u001B[32m";
    public static int count=0;

    public static void main(String[] args) {
        Solution sol = new Solution();

        check(sol.searchInsert(new int[]{1,3,5,6}, 5),2); //test case 1
        check(sol.searchInsert(new int[]{1,3,5,6}, 2),1); //test case 2
        check(sol.searchInsert(new int[]{1,3,5,6}, 7),4); //test case 3

    }

    public static void check(int in,int ans){
        count++;
        System.out.print(count+". Insert Position: "+in+", verdict: ");
        if(in == ans){
            System.out.println(GREEN + "correct" + RESET);
        }else{
            System.out.println(RED + "incorrect" + RESET);
        }

    }
}