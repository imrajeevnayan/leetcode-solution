class Solution {
    int maxSubarraySum(int[] arr) {
      int curr=0,maxSum=Integer.MIN_VALUE;
      for(int n :arr){
          curr+=n;
          if(curr >maxSum)maxSum=curr;
          if(curr < 0)curr=0;
      }
      return maxSum;
        
    }
}