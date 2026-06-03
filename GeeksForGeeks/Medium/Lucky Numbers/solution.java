class Solution {
    public static boolean isLucky(int n) {
        int step = 2;
        
        while (step <= n) {
            if (n % step == 0) {
                return false;
            }
            n = n - n / step;
            step++;
        }
        
        return true;
    }
}