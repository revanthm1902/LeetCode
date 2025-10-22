class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length;
        int candidate = 0, count = 0;
        for (int no : nums) {
            if (count == 0) {
                candidate = no;
            }
            count += (no == candidate) ? 1 : -1;
        }
        count = 0;
        for (int no : nums) {
            if (no == candidate) {
                count++;
            }
        }
        if (count > nums.length / 2) {
            return candidate;
        } else {
            return -1;
        }
    }
}