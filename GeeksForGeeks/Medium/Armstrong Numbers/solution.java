class Solution {
    static boolean armstrongNumber(int n) {
        int sum=0,temp=n;
        while(n >0){
            int d=n %10;
            sum+=d*d*d;
            n=n/10;
        }
        return temp==sum;
    }
}