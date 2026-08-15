class Solution {
    public static int countBitsFlip(int a, int b) {
        return Integer.bitCount(a ^ b);
    }
}