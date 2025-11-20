class Solution {
    public int lastRemaining(int n) {
        int head=1;
        int step=1;
        boolean l=true;
        while(n>1){
            if(l || (n%2==1)) head+=step;
            step*=2;
            n/=2;
            l=!l;
        }
        return head;
    }
}