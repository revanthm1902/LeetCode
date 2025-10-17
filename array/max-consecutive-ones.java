class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count=0;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            count= (nums[i]==1) ? count+1 : 0;
            if(count>max) max=count;
        }
        return max;
    }
}