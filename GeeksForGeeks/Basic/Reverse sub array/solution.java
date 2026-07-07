class Solution {
    public static ArrayList<Integer> reverseSubArray(ArrayList<Integer> arr, int l,
                                                     int r) {
        l--; // convert to 0-based indexing
        r--;

        while (l < r) {
            int temp = arr.get(l);
            arr.set(l, arr.get(r));
            arr.set(r, temp);

            l++;
            r--;
        }

        return arr;
    }
}