
class Solution {

    public long minMaxProduct(int[] arr1, int[] arr2) {
         int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int x : arr1) {
            max = Math.max(max, x);
        }

        for (int x : arr2) {
            min = Math.min(min, x);
        }

        return (long) max * min;
        
    }
}