class Solution {
    public int[] countOddEven(int[] arr) {
        int evenCount=0,oddCount=0;
        for(int n :arr){
            if(n %2==0)evenCount++;
            else oddCount++;
        }
        return new int[]{oddCount,evenCount};
    }
}