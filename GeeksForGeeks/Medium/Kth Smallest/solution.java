class Solution {
    public int kthSmallest(int[] arr, int k) {
      PriorityQueue<Integer>pq=new PriorityQueue<>();
      for(int n :arr)pq.add(n);
      for(int i=0;i<k-1;i++)pq.poll();
      return pq.poll();
        
    }
}