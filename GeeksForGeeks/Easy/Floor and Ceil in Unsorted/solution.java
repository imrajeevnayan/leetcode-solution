class Solution {
    public int[] getFloorAndCeil(int x, int[] arr) {
        int floor = -1,ceil = -1;
        for (int num : arr) {
            // Floor: Largest number <= x
            if (num <= x) {
                if (floor == -1 || num > floor) floor = num;
            }
            // Check for Ceil: Smallest number >= x
            if (num >= x) {
                if (ceil == -1 || num < ceil)  ceil = num;
                
            }
        }
        return new int[]{floor, ceil};
    }
}