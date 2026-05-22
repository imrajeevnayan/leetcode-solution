class Solution {
    public ArrayList<Integer> kLargest(int[] arr, int k) {
     PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        ArrayList<Integer> res = new ArrayList<>();
        for (int n : arr) pq.add(n);
        for (int i = 0; i < k; i++)  res.add(pq.poll());
        return res;
    }
}