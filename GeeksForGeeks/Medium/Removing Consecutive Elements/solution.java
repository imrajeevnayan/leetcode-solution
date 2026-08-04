class Solution {
    public int[] remove_special_consecutive(int[] arr, int x, int y) {
        
        int[] temp = new int[arr.length];
        int n = 0;

        for (int i = 0; i < arr.length; i++) {
            if (n > 0 && arr[i] == temp[n - 1] &&
               (arr[i] == x || arr[i] == y)) {
                continue;
            }
            temp[n++] = arr[i];
        }

        int[] ans = new int[n];
        for (int i = 0; i < n; i++) {
            ans[i] = temp[i];
        }

        return ans;
    }
}