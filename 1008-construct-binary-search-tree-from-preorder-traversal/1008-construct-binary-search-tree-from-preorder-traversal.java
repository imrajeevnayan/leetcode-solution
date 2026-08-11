class Solution {
    public TreeNode bstFromPreorder(int[] preorder) {
        Deque<TreeNode> stack = new ArrayDeque<>();

        TreeNode root = new TreeNode(preorder[0]);
        stack.push(root);
        for (int i = 1; i < preorder.length; i++) {
            TreeNode curr = new TreeNode(preorder[i]);
            TreeNode parent = null;

            while (!stack.isEmpty() && stack.peek().val < curr.val) {
                parent = stack.pop();
            }

            if (parent != null) {
                parent.right = curr;
            } else {
                stack.peek().left = curr;
            }

            stack.push(curr);
        }

        return root;
    }
}