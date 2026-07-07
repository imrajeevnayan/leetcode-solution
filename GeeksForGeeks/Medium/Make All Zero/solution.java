class Solution {
    public boolean makeZero(int arr[]) {
        int xor = 0;
        for (int x : arr) {
            xor ^= x;
        }

        if (xor == 0) {
            return false;   // First player wins immediately
        }

        return (arr.length % 2 == 1);   // Second wins iff n is odd
    }
}