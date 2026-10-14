class Solution {
    public TreeNode invertTree(TreeNode root) {
        // Base case: Agar node null hai, toh kuch nahi karna
        if (root == null) return null;
        
        
        // Left aur Right subtree ko recursively invert karo
        TreeNode left = invertTree(root.left);
        TreeNode right = invertTree(root.right);
        
        // Swap karo: Left mein right daalo, Right mein left daalo
        root.left = right;
        root.right = left;
        
        return root;
    }
}