class Solution {
    int[] getMoreAndLess(int[] arr, int target) {
        int lessOrEqual = 0;
        int greaterOrEqual = 0;

        for (int num : arr) {
            if (num <= target) lessOrEqual++;
            if (num >= target) greaterOrEqual++;
        }
        return new int[]{lessOrEqual, greaterOrEqual};
    }
}