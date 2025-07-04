class Solution {
    public boolean isPalindrome(String s) {
        if(s.equals("") || s.equals(" ")){
            return true;
        }
        String filtered=s.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
        int left=0, right=filtered.length()-1;
        while(left<right){
            if(filtered.charAt(left)!=filtered.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
