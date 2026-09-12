class Solution {
    public int findMaxProduct(int[] arr, int k) {
        int left=0,currProd=1,maxProd=Integer.MIN_VALUE;
        for(int right=0;right<arr.length;right++){
            currProd *=arr[right];
            if(right-left+1==k){
                maxProd=Math.max(maxProd,currProd);
                currProd /=arr[left];
                left++;
            }
        }
        return maxProd;
    }
}