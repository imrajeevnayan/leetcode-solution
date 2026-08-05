class Solution {
    public int maxPerimeter(int[] arr) {
        mergeSort(arr, 0, arr.length - 1);
        for (int i = arr.length - 1; i >= 2; i--) {
            if (arr[i - 1] + arr[i - 2] > arr[i]) {
                return arr[i] + arr[i - 1] + arr[i - 2];
            }
        }
        return -1;
    }
    private void mergeSort(int[] arr, int left, int right) {
        if (left >= right) return;
        int mid = left + (right - left) / 2;
        mergeSort(arr, left, mid);
        mergeSort(arr, mid + 1, right);
        merge(arr, left, mid, right);
    }
    private void merge(int[] arr, int left, int mid, int right) {
        int[] temp = new int[right - left + 1];

        int i = left;
        int j = mid + 1;
        int k = 0;

        while (i <= mid && j <= right) {
            if (arr[i] <= arr[j]) {
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
            }
        }

        while (i <= mid) {
            temp[k++] = arr[i++];
        }

        while (j <= right) {
            temp[k++] = arr[j++];
        }

        for (i = 0; i < temp.length; i++) {
            arr[left + i] = temp[i];
        }
    }
}