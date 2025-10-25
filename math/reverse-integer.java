class Solution {
    public int reverse(int x) {
        int revn =0;
        while(x!=0){
            int ld= x % 10;
            if (revn > Integer.MAX_VALUE / 10 || (revn == Integer.MAX_VALUE / 10 && ld > 7)) {
                return 0;
            }
            if (revn < Integer.MIN_VALUE / 10 || (revn == Integer.MIN_VALUE / 10 && ld < -8)) {
                return 0;
            }
            revn=(revn*10)+ld;
            x=x/10;
        }
        return revn;
    }
}