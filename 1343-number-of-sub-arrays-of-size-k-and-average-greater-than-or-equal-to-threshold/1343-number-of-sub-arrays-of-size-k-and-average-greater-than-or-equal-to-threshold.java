class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int left=0,currSum=0,count=0;
        long target=(long)threshold*k;
        for(int right=0;right<arr.length;right++){
                 currSum+=arr[right];
            if(right-left+1==k){
                if(currSum >=target) count++;
                currSum-=arr[left]++;
                left++;
            }
        }
        return count;
    }
}