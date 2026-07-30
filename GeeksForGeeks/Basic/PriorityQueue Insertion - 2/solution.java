class Solution {
    public static PriorityQueue<Integer> insertion(ArrayList<Integer> arr) {
        PriorityQueue<Integer>pq=new PriorityQueue<>(Collections.reverseOrder());
        for(int n :arr)pq.add(n);
        return pq;
    }
}