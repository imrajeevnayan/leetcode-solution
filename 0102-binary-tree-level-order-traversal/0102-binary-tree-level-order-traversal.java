class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        
        // Edge case: Agar tree empty hai
        if (root == null) return result;
        
        // Queue banao BFS ke liye
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        
        while (!queue.isEmpty()) {
            int levelSize = queue.size(); // Current level ke nodes ki count
            List<Integer> currentLevel = new ArrayList<>();
            
            // Sirf current level ke nodes ko process karo
            for (int i = 0; i < levelSize; i++) {
                TreeNode node = queue.poll();
                currentLevel.add(node.val);
                
                // Bachon ko queue mein daalo for next level
                if (node.left != null) {
                    queue.offer(node.left);
                }
                if (node.right != null) {
                    queue.offer(node.right);
                }
            }
            
            // Poora level add karo result mein
            result.add(currentLevel);
        }
        
        return result;
    }
}