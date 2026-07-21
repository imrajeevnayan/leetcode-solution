class Solution {
    public int rob(TreeNode root) {
        int[] ans = solve(root);
        return Math.max(ans[0], ans[1]);
    }
    int[] solve(TreeNode node) {
        if (node == null)  return new int[]{0, 0};
        int[] left = solve(node.left);
        int[] right = solve(node.right);
        // Skip current node
        int notRob = Math.max(left[0], left[1]) + Math.max(right[0], right[1]);
        // Rob current node
        int rob = node.val + left[0] + right[0];
        return new int[]{notRob, rob};
    }
}
