class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        int[]ans=new int[nums.length];
        int odd=1,even=0;
        for(int n:nums){
            if(n %2==0){
                ans[even]=n;
                even+=2;
            }
            else {
                ans[odd]=n;
                odd+=2;
            }
        }
        return ans;
    }
}