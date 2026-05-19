class Solution {
    public void sortColors(int[] nums) {
        int zeroCount=0,oneCount=0,twoCount=0;
        for(int n :nums){
            if(n==0)zeroCount++;
            else if(n==1)oneCount++;
            else twoCount++;
        }
        int i=0;
        while(zeroCount-- >0)nums[i++]=0;
        while(oneCount-- >0)nums[i++]=1;
        while(twoCount-- >0)nums[i++]=2;
    }
}