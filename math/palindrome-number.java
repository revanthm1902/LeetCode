class Solution {
    public boolean isPalindrome(int x) {
        int d=x;
        int rn=0;
        while(x>0){
            int ld=x%10;
            if(x>Integer.MAX_VALUE/10 && ld>7){
                return false;
            }
            
            rn=(rn*10)+ld;
            x=x/10;
        }
        if(d==rn){
            return true;
        }else{
            return false;
        }
    }
}