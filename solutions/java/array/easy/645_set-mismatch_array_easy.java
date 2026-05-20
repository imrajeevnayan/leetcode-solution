class Solution {
    public int[] findErrorNums(int[] nums) {
        int n=nums.length;
        int dup=0;
        Set<Integer>s=new HashSet<>();
        for(int num:nums){
            if(!s.add(num))dup=num;
        }
        int total=n*(n+1)/2;
        int sum=0;
        for(int num:nums )sum+=num;
        int missing=total-(sum-dup);
        int ans[]=new int[2];
        ans[0]=dup;
        ans[1]=missing;
        return ans;
    }
}