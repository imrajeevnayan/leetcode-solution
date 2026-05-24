class Solution {
     static boolean isFour(int n) {
        while (n> 0) {
            if (n % 10 == 4) return true;
             n /= 10;
        }
        return false;
    }
    public static int countNumberswith4(int n) {
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (isFour(i))count++;
        }
            return count;
    }
}