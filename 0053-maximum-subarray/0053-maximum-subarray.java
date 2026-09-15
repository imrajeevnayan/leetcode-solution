class Solution {
    public int maxSubArray(int[] nums) {
        int maxsum=Integer.MIN_VALUE,curr=0;
        for(int n:nums){
            curr+=n;
            if(curr >maxsum)maxsum=curr;
            if(curr <0) curr=0;
        }
        return maxsum;
    }
}