import java.util.*;
class Solution {
    public int countPrimes(int n) {
        if (n<=2) return 0;
        boolean[] isP= new boolean[n];
        Arrays.fill(isP,true);
        isP[0]=false;
        isP[1]=false;

        for(int i=2;i<=Math.sqrt(n);i++){
            if(isP[i]){
                for(int j=i*i;j<n;j+=i){
                    isP[j]=false;
                }
            }
        }
        int count=0;
        for(int i=2;i<n;i++){
            if(isP[i]) count++;
        }
        return count;
    }
}