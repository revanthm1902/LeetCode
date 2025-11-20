class Solution {
    public int countBinaryPalindromes(long n) {

        int count = 0;
        for (long i = 0; i <= n; i++) {
            String bin = Long.toBinaryString(i);
            if (bin.equals(new StringBuilder(bin).reverse().toString())) {
                count++;
            }
        }
        return count;
    }
}
