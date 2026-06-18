class Solution {
    int countPairs(int arr[], int target) {
       int count=0;
      HashMap<Integer,Integer>map=new HashMap<>();
      for(int n:arr){
          int rem=target-n;
          if(map.containsKey(rem))count+=map.get(rem);
          map.put(n,map.getOrDefault(n,0)+1);
      }
      return count;
    }
}
