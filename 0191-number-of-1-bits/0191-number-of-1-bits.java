class Solution {
    public int hammingWeight(int n) {
        int count = 0;
        for (int k = 0; k < 32; k++) {
            if ((n & (1 << k)) != 0) {
                count++;
            }
        }
        return count;
    }
}
