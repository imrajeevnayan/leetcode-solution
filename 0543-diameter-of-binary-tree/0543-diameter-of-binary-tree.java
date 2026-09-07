class Solution {
    int diameter = 0;
    public int diameterOfBinaryTree(TreeNode root) {
        height(root);
        return diameter;
    }
    int height(TreeNode root) {
        if (root == null) return 0;
        int left = height(root.left);
        int right = height(root.right);

        // Current node ke through diameter
        diameter = Math.max(diameter, left + right);
        // Height return karo
        return 1 + Math.max(left, right);
    }
}
