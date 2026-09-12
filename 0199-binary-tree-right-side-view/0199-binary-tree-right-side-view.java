class Solution {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        // Empty tree
        if (root == null) return ans;
        
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {

            int size = queue.size();

            // Current level ke saare nodes process karo
            for (int i = 0; i < size; i++) {

                TreeNode node = queue.poll();

                // Current level ka last node
                if (i == size - 1) {
                    ans.add(node.val);
                }

                // Left child
                if (node.left != null) {
                    queue.offer(node.left);
                }

                // Right child
                if (node.right != null) {
                    queue.offer(node.right);
                }
            }
        }

        return ans;
    }
}
