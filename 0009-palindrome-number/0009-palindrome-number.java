class Solution {
    static int reverse( int x){
        int rev=0;
        while(x> 0){
            rev=rev*10 +(x %10);
            x/=10;
        }
        return rev;
    }
    public boolean isPalindrome(int x) {
        if(x<0) return false;
        if(x >0 && x< 10) return true;
        return x==reverse(x);
    }
}