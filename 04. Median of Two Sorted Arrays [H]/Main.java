import java.util.Arrays;

class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m=nums1.length;
        int n=nums2.length;

        if(m<0 || m>1000 || n<0 || n>1000){return 0;}

        if(m+n<1 || m+n>2000){return 0;}

        int [] merged = new int[m+n];

        System.arraycopy(nums1,0,merged,0,m);
        System.arraycopy(nums2,0,merged,m,n);

        Arrays.sort(merged);

        int mn=merged.length;
        if (mn % 2 != 0)
            return (double)merged[mn / 2];
 
        return (double)(merged[(mn - 1) / 2] + merged[mn / 2]) / 2.0;

    }
}

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        int[] nums1 = {1, 3};
        int[] nums2 = {2};

        double median = solution.findMedianSortedArrays(nums1, nums2);
        System.out.println("Median: " + median);

        int[] nums3 = {1, 2};
        int[] nums4 = {3, 4};

        double median2 = solution.findMedianSortedArrays(nums3, nums4);
        System.out.println("Median: " + median2);
    }
}
