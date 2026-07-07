class Solution {
    int getOddOccurrence(int[] arr) {
        int result = 0;

        for (int x : arr) {
            result ^= x;
        }

        return result;
    }
}