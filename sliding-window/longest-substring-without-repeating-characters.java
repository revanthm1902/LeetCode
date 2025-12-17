class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n=s.length();
        int max=Integer.MIN_VALUE;
        int i=0; int j=0;
        if(n==0) return 0;
        Set<Character> set=new HashSet<>();
        while(j<n){
            if(!set.contains(s.charAt(j))){
                set.add(s.charAt(j));
                j++;
                max=Math.max(max,j-i);
            } else{
                set.remove(s.charAt(i));
                i++;
            }
        }
        return max;
    }
}