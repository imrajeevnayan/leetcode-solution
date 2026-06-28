class Solution {
    public int maxSubarraySum(int[] arr, int k) {
        int n=arr.length;
        int maxSum=0,curr=0;
        for(int i=0;i<k;i++) curr+=arr[i];
        maxSum=curr;
        for(int i=k;i<n;i++){
            curr+=arr[i]-arr[i-k];
            maxSum=Math.max(maxSum,curr);
        }
        return maxSum;
    }
}