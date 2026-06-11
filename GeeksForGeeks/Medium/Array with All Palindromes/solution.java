class Solution {
    static boolean isPalindrome(int n){
        int org=n;
        int rev=0;
        while(n > 0){
            rev=rev*10+ (n %10);
            n/=10;
        }
        return org==rev;
    }
    public static boolean isPalinArray(int[] arr) {
        for(int n:arr){
            if( !isPalindrome(n)) return false;
        }
        return true;
    }
}