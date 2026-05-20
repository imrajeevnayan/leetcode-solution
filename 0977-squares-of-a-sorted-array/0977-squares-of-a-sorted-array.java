class Solution {
    public int[] sortedSquares(int[] nums) {
        int ans[]=new int[nums.length];
        int j=0;
        for(int i=0;i<nums.length;i++){
            ans[j++]=nums[i]*nums[i];
        }
        Arrays.sort(ans);
        return ans;
        
    }

}