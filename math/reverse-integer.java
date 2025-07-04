class Solution {
    public int reverse(int x) {
        int rn =0;
        while(x!=0){
            int ld= x % 10;
            if (rn > Integer.MAX_VALUE / 10 || (rn == Integer.MAX_VALUE / 10 && ld > 7)) {
                return 0;
            }
            if (rn < Integer.MIN_VALUE / 10 || (rn == Integer.MIN_VALUE / 10 && ld < -8)) {
                return 0;
            }
            rn=(rn*10)+ld;
            x=x/10;
        }
        return rn;
    }
}