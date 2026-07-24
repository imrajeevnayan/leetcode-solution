class Solution {
    public int findMidSum(int[] arr1, int[] arr2) {
        int n = arr1.length;
        int i = 0, j = 0;
        int prev = 0,curr = 0;
        for (int count = 0; count <= n; count++) {
            prev = curr;

            if (i < n && j < n) {
                if (arr1[i] <= arr2[j]) curr = arr1[i++];
                else curr = arr2[j++];
                
            } else if (i < n) {
                curr = arr1[i++];
            } else {
                curr = arr2[j++];
            }
        }

        return prev + curr;
    }
}