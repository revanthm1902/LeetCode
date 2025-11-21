class Solution {
    public void rotate(int[] nums, int k) {
    //     int n=nums.length;
    //     if(k>n) k%=n;
    //     reverse(nums,0,n-1);
    //     reverse(nums,0,k-1);
    //     reverse(nums,k,n-1);
    // }
    // public void reverse(int[] nums,int l,int r){
    //     while(l<r){
    //         int temp=nums[l];
    //         nums[l]=nums[r];
    //         nums[r]=temp;
    //         l++; r--;
    //     }
        int n=nums.length;
        if(k==0 || k==n) return;
        if(k>n){
            k%=n;
        }
        int res[]= new int[n];
        for(int i=0;i<n;i++){
            res[i]=nums[(n-k+i)%n];
        }
        for(int i=0;i<n;i++){
            nums[i]=res[i];
        }
    }
}