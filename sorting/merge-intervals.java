class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a,b) -> a[0]-b[0]);

        List<int[]> merged=new ArrayList<>();

        int st=intervals[0][0];
        int end=intervals[0][1];

        for(int i=1;i<intervals.length;i++){
            int nextSt=intervals[i][0];
            int nextEnd=intervals[i][1];

            if(end>=nextSt){
                end=Math.max(end,nextEnd);
            } else{
                merged.add(new int[]{st,end});
                st=nextSt;
                end=nextEnd;
            }
        }
        merged.add(new int[]{st,end});
        return merged.toArray(new int[merged.size()][]);
    }
}