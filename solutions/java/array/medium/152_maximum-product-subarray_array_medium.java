public class Solution {
    public int maxProduct(int[] nums) {
      int min=nums[0],max=nums[0],res=nums[0];
      for(int i=1;i<nums.length;i++){
        int  curr=nums[i];
        if(curr < 0){
            int temp=max;
            max=min;
            min=temp;
        }  
        max=Math.max(curr,max*curr);
        min=Math.min(curr,min*curr);
       res=Math.max(res,max);
      }
      return res;
    }
}