class Solution {
    public int maxProduct(int[] nums) {
        int max_eh=nums[0];
        int min_eh=nums[0];
        int max_sf=nums[0];

        for(int i=1;i<nums.length;i++){
            int temp=Math.max(
                Math.max(nums[i],nums[i]*max_eh),
                nums[i]*min_eh
            );
            min_eh=Math.min(
                Math.max(nums[i],nums[i]*max_eh),
                nums[i]*min_eh
            );
            max_eh=temp;

            max_sf=Math.max(max_sf,max_eh);
        }
        return max_sf;
    }
}