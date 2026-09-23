class Solution {
    public int rob(TreeNode root) {
        // Helper function se [rob, skip] values ka array milega
        int[] result = helper(root);
        // Root ko rob karein ya skip karein, jo max ho wo return kardo
        return Math.max(result[0], result[1]);
    }
    
    private int[] helper(TreeNode node) {
        // Base Case: Agar node null hai, toh rob=0, skip=0
        if (node == null) return new int[]{0, 0};
        
        // Left subtree se values lao
        int[] left = helper(node.left);

        // Right subtree se values lao
        int[] right = helper(node.right);
        
        // Choice 1: Current node ko ROB karo
        // Toh left aur right child ko SKIP karna padega (left[1], right[1])
        int robCurrent = node.val + left[1] + right[1];
        
        // Choice 2: Current node ko SKIP karo
        // Toh left aur right child ko ROB ya SKIP kar sakte ho (jo max ho)
        int skipCurrent = Math.max(left[0], left[1]) + Math.max(right[0], right[1]);
        
        // Return karo: [robCurrent, skipCurrent]
        return new int[]{robCurrent, skipCurrent};
    }
}