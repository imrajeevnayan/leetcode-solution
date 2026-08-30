class Solution {
    public int kthLargest(Node root, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        solve(root, k, pq);
        return pq.peek();
    }

    void solve(Node root, int k, PriorityQueue<Integer> pq) {
        if (root == null)  return;
        pq.add(root.data);

        if (pq.size() > k) pq.poll();
        solve(root.left, k, pq);
        solve(root.right, k, pq);
    }
}