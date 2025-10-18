class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> setA=new HashSet<>();
        for(int n:nums1) setA.add(n);

        Set<Integer> intsn=new HashSet<>();
        for(int n:nums2){
            if(setA.contains(n)) intsn.add(n);
        }
        int[] res=new int[intsn.size()];
        int i=0;
        for(int n:intsn) res[i++]=n;
        return res;
    }
}