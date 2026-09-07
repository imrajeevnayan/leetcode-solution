class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        //root null hai
        if (root == null)  return null;
    
        // Agar root hi p ya q hai
        if (root == p || root == q) return root;
        // Left aur right mein search
        TreeNode left = lowestCommonAncestor(root.left, p, q);
        TreeNode right = lowestCommonAncestor(root.right, p, q);
        // Ek left mein, ek right mein
        if (left != null && right != null)  return root;
        
        // Jo side mila, uska answer return
        if (left != null) return left;
        return right;
    }
}
