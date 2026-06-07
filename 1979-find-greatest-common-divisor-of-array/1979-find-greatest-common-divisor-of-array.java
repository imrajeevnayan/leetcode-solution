class Solution {
    public int findGCD(int[] nums) {
        int max=nums[0];
        int min=nums[0];
        for(int n:nums){
            max=Math.max(max,n);
            min=Math.min(min,n);
        }
        return gcd(max,min);
    }
    static int gcd(int a,int b){
        while(b!=0){
            int temp=b;
            b=a % b;
            a=temp;
        }
        return a;
    }
}