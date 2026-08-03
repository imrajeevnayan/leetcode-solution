class Solution {
    public void rearrange(int arr[]) {
        Arrays.sort(arr);

        int n = arr.length;
        int[] temp = new int[n];

        int left = 0;
        int right = n - 1;
        int index = 0;

        while (left <= right) {
            if (index < n) {
                temp[index++] = arr[right--]; // maximum
            }

            if (left <= right) {
                temp[index++] = arr[left++]; // minimum
            }
        }

        for (int i = 0; i < n; i++) {
            arr[i] = temp[i];
        }
    }
}