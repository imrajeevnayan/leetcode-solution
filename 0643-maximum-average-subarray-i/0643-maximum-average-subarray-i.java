class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int left=0,currSum=0,ans=Integer.MIN_VALUE; 
        for(int right=0;right<nums.length;right++){
            currSum+=nums[right];
            if(right-left+1>k){
                currSum-=nums[left];
                left++;
            }
            if(right-left+1==k){
                ans=Math.max(ans,currSum);
            }
        }
        return (double)ans/k;
    }
}