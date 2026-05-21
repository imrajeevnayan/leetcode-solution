class Solution {
    public ArrayList<Integer> topKFreq(int[] arr, int k) {
        ArrayList<Integer>ans=new ArrayList<>();
        Map<Integer,Integer>map=new HashMap<>();
        for(int n :arr){
            map.put(n,map.getOrDefault(n,0)+1);
        }
    PriorityQueue<Integer> pq = new PriorityQueue<>(
    (a, b) -> {
        if (map.get(b).equals(map.get(a)))return b - a; 
          return map.get(b) - map.get(a); 
    });
         pq.addAll(map.keySet());
         for(int i=0;i<k;i++){
             ans.add(pq.poll());
         }
         return ans;
    }
}
