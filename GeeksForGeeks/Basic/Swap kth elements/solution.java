class Solution {
    public void swapKth(List<Integer> arr, int k) {
        int n = arr.size();

        int first = k - 1;
        int second = n - k;

        int temp = arr.get(first);
        arr.set(first, arr.get(second));
        arr.set(second, temp);
    }
}