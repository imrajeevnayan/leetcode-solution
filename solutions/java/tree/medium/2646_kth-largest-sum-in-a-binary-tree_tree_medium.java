class Solution {
    public long kthLargestLevelSum(TreeNode root, int k) {
        if (root == null) return -1;

        PriorityQueue<Long> pq = new PriorityQueue<>();
        
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        
        while (!queue.isEmpty()) {
            int size = queue.size();
            long levelSum = 0;
            
            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();
                levelSum += node.val;
                
                if (node.left != null) queue.offer(node.left);
                if (node.right != null) queue.offer(node.right);
            }
            pq.offer(levelSum);
            
            if (pq.size() > k) {
                pq.poll();
            }
        }
        
        if (pq.size() < k) {
            return -1;
        }
        
        return pq.peek();
    }
}