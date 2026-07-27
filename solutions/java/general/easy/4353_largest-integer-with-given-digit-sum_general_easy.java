class Solution {
    public int largestInteger(int n, int s) {
        if(s ==0) return 0;
        for(int i=(int)(Math.pow(10, n)) - 1;i>=0;i--){
            if(sum(i) == s)return i;            
        }
        return -1;
    }
    private int sum(int x){
        int sum = 0;
        while( x > 0){
            sum += (x%10);
            x/=10;
        }
        return sum;
    }
}