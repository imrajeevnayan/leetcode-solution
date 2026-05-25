class Solution {
    static int evenlyDivides(int n) {
        int count =0 , temp=n;
        while(n >= 1){
         int d=n %10;
         if( d!=0 && temp % d==0) count++;
           n=n/10;
         }  
        return count;
    }
}