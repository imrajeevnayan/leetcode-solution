class Solution {
    static int onesComplement(int n) {
        int x = 1;

        while (x <= n) {
            x <<= 1;
        }

        return (x - 1) ^ n;
    }
}