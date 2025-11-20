class Solution {
    public int countBinaryPalindromes(long n) {
        int count = 0;
        for (long i = 0; i <= n; i++) {
            if (isPal(i)) {
                count++;
            }
        }
        return count;
    }

    public boolean isPal(long x) {
        String s1 = "";
        String s2 = "";
        long temp = x;
        if (temp == 0) return true;
        while (temp > 0) {
            long bit = temp % 2;
            s1 = s1 + bit; 
            s2 = bit + s2;
            temp /= 2;
        }
        return s1.equals(s2);
    }
}
