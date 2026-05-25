class Solution {
    public int findUnique(int[] arr) {
      int res=0;
      for(int n :arr)res^=n;
      return res;
    }
}