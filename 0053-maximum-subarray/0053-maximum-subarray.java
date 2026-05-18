class Solution {
    public int maxSubArray(int[] nums) {
        int maxSum=Integer.MIN_VALUE,curr=0;
        for(int n :nums){
            curr+=n;
            if(curr > maxSum)maxSum=curr;
            if(curr < 0) curr=0;
        }
        return maxSum;
        
    }
}