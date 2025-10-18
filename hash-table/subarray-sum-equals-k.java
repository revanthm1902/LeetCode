class Solution {
    public int subarraySum(int[] nums, int k) {
        int l = 0, r = 0;
        int sum = 0;
        int count = 0;
        int n = nums.length;

        while (r < n) {
            sum += nums[r];
            while (l <= r && sum > k) {
                sum -= nums[l];
                l++;
            }
            if (sum == k) count++;
            r++;
        }
        return count;
    }
}
