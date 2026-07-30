class Solution {
    public int maxSubsetXOR(int[] arr) {
        int n = arr.length;
        int index = 0;
        for (int bit = 31; bit >= 0; bit--) {

            int pivot = -1;
            for (int i = index; i < n; i++) {
                if ((arr[i] & (1 << bit)) != 0) {
                    pivot = i;
                    break;
                }
            }
            if (pivot == -1)continue;

            int temp = arr[index];
            arr[index] = arr[pivot];
            arr[pivot] = temp;

            for (int i = 0; i < n; i++) {
                if (i != index && (arr[i] & (1 << bit)) != 0) {
                    arr[i] ^= arr[index];
                }
            }

            index++;
        }
        int ans = 0;
        for (int num : arr) {
            ans = Math.max(ans, ans ^ num);
        }
        return ans;
    }
}