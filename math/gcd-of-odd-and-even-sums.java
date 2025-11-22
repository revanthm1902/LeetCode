class Solution {
    public int gcdOfOddEvenSums(int n) {
        int odd=n*n;
        int even=n*(n+1);
        int res=gcd(odd,even);
        return res;
    }
    static int gcd(int a,int b){
        if(a==0) return b;
        return gcd(b%a,a);
    }
}