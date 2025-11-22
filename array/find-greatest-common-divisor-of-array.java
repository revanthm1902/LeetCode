class Solution {
    public int findGCD(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        int min=nums[0];
        int max=nums[n-1];
        int res=gcd(min,max);
        return res;
    }
    static int gcd(int a,int b){
        if(a==0) return b;
        return gcd(b%a,a); 
    }
}