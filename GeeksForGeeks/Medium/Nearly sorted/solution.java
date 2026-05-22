class Solution {
    public void nearlySorted(int[] arr, int k) {
     int idx=0;
     PriorityQueue<Integer>pq=new PriorityQueue<>();
     for(int n:arr){
         pq.add(n);
         if(pq.size()>k) arr[idx++]=pq.poll();
     }
     while(pq.size()>0)arr[idx++]=pq.poll();
    }
}
