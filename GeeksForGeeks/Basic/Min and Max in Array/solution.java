class Solution {
    public ArrayList<Integer> getMinMax(int[] arr) {
    ArrayList<Integer>ans=new ArrayList<>();
      int min=Integer.MAX_VALUE;
      int max=Integer.MIN_VALUE;
      for(int n :arr){
          if(n < min) min=n;
          if(n > max) max=n;
      }
    ans.add(min);
    ans.add(max);
    return ans;
    }
}
