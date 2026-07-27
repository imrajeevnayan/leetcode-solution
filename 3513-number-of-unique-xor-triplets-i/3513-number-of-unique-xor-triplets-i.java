class Solution {
    public int uniqueXorTriplets(int[] nums) {
        int n = nums.length;
        int len = Integer.toBinaryString(n).length();
        if(n >= 3){
            return (int)Math.pow(2, len);
        }
        return n;
    }
}