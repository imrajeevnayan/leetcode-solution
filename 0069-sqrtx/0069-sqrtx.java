class Solution {
    public int mySqrt(int x) {
        int low = 1,high = x,ans = 0;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (mid <= x / mid) {
                // mid * mid <= n
                ans = mid;
                // aur bada answer try karo
                low = mid + 1;
            } 
            else {
                // mid * mid > n
                // left side jao
                high = mid - 1;
            }
        }
        return ans;
    }
}