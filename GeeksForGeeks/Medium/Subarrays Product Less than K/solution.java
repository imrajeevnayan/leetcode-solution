class Solution {
    public int countSubarray(int[] nums, int k) {
         int  left =0,count=0,prod=1;
        if(k <=1) return 0;
        for(int right=0;right<nums.length;right++){
            prod*=nums[right];
            while(prod>=k){
                prod/=nums[left];
                left++;
            }
            count+=right-left+1;
        }
        return count;
        
    }
}