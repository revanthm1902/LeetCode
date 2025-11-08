import java.util.*;

class Solution {
    public int findKthLargest(int[] nums, int k) {
        int n=nums.length-1;
        Arrays.sort(nums);
        for(int i=n;i>=0;i--){
            return nums[n-k]+1;
        }
        return -1;
    }
}