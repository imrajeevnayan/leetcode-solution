class Solution {
    public int findKthPositive(int[] arr, int k) {
        int left = 0, right = arr.length - 1, ans=arr.length;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if(arr[mid]-mid-1 >=k){
                ans=mid;
                right=mid-1;
            }
           else   left = mid +1;
        }
       return ans+ k;
    }
}