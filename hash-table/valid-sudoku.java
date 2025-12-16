class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashSet<String> seen=new HashSet<>();
        int n=board.length;
        int sqrtN=(int)Math.sqrt(n);

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                char curr=board[i][j];

                if(curr!='.'){
                    String rowKey="row"+i+"_"+curr;
                    String colKey="col"+i+"_"+curr;
                    String boxKey="box"+((i/sqrtN)*sqrtN+j/sqrtN)+"_"+curr;

                    if(!seen.add(rowKey)||!seen.add(colKey)||!seen.add(boxKey)){
                        return false;
                    }
                }
            }
        }
        return true;
    }
}