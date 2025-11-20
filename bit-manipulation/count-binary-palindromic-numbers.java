class Solution {
    public int countBinaryPalindromes(long n) {
        int count=0;
        for(long i=0;i<=n;i++){
            long rev=0;
            long copy=i;
            while(copy!=0){
                rev=(rev<<1)|(copy & 1);
                copy>>=1;
            }
            if(rev==i) count++;
        }
        return count;
    }
}