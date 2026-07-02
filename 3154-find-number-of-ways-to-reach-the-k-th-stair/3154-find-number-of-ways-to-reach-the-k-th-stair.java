class Solution {
    public int waysToReachStair(int k) {
        long[][] comb = new long[35][35];
        for (int i = 0; i < 35; i++) {
            comb[i][0] = 1;
            for (int j = 1; j <= i; j++) {
                comb[i][j] = comb[i - 1][j - 1] + comb[i - 1][j];
            }
        }

        int result = 0;
        for (int i = 0; i < 31; i++) {
            long forward = 1L << i; // 2^i
            
            long b = forward - k;
            
            if (b >= 0 && b <= i + 1) {
                result += comb[i + 1][(int) b];
            }
        }
        
        return result;
    }
}