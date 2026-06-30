class Solution {
    int countTriplets(int sum, int arr[]) {
        Arrays.sort(arr);
        int n = arr.length,count = 0;
        for (int i = 0; i < n - 2; i++) {
            int left = i + 1, right = n - 1;
            while (left < right) {
                int currSum = arr[i] + arr[left] + arr[right];
                if (currSum < sum) {
                    count += (right - left);
                    left++;
                } 
                else right--;
            }
        }
        return count;
    }
}