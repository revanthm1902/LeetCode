class Solution {
    public int rob(int[] nums) {
        int n=nums.length;
        if(n==0) return 0;
        if(n==1) return nums[0];

        return Math.max(robbed(nums,0,n-2),robbed(nums,1,n-1));
    }
    public int robbed(int[] nums, int l, int r){
        int prev2=0;
        int prev1=0;

        for(int i=l;i<=r;i++){
            int curr=Math.max(prev1,prev2+nums[i]);
            prev2=prev1;
            prev1=curr;
        }
        return prev1;
    }
}