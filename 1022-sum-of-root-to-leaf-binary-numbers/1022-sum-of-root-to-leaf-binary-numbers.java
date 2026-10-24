class Solution {
    public int sumRootToLeaf(TreeNode root) {
        return dfs(root, 0);
    }
    
    private int dfs(TreeNode node, int currentSum) {
        if (node == null) return 0;
        
        // Update currentSum using simple math
        // Pichla number double karo aur current node ka value add karo
        currentSum = currentSum * 2 + node.val;
        
        // If it's a leaf node, return the current number
        if (node.left == null && node.right == null) return currentSum;
        
        // Recursively calculate sum for left and right subtrees
        return dfs(node.left, currentSum) + dfs(node.right, currentSum);
    }
}