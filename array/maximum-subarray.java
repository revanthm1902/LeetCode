class Solution {
    public int maxSubArray(int[] nums) {
        int maxProduct = nums[0], minProduct = nums[0], globalMax = nums[0];
        for (int i = 1; i < nums.length; i++) {
            int temp = Math.max(nums[i], Math.max(maxProduct + nums[i], minProduct + nums[i]));
            minProduct = Math.min(nums[i], Math.min(maxProduct + nums[i], minProduct + nums[i]));
            maxProduct = temp;
            globalMax = Math.max(globalMax, maxProduct);
        }
        return globalMax;
    }
}