class Solution {
    public int[] sortArray(int[] nums) {
        sort(nums,0,nums.length-1);
        return nums;
    }
    public int[] sort(int[] nums, int l, int h) {
        if(l<h){
            int pi=partition(nums,l,h);
            sort(nums,l,pi-1);
            sort(nums,pi+1,h);
        }
        return nums;
    }
    public int partition(int[] nums,int l, int h){
        int pi=nums[l],i=l+1,j=h;
        while(i<=j){
            while(i<h && nums[i]<pi) i++;
            while(j>l && nums[j]>pi) j--;
            if(i<j) swap(nums,i,j);
            else break;
        }
        swap(nums,j,l);
        return j;
    }
    public void swap(int[] nums,int i,int j){
        int t=nums[i];
        nums[i]=nums[j];
        nums[j]=t;
    }
}