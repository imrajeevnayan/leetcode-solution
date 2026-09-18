class Solution {
    public boolean isBalanced(Node root) {
        if (root == null) return true;    // khaali tree = balanced
        
        // Current node ka check
        int lh = height(root.left);
        int rh = height(root.right);
        if (Math.abs(lh - rh) > 1) return false;
        
        // ⚠️ HAR node ka check — left aur right DONO ko bhi poochо!
        return isBalanced(root.left) && isBalanced(root.right);
    }
    
    private int height(Node node) {
        if (node == null) return 0;
        return 1 + Math.max(height(node.left), height(node.right)); // postorder! ↑
    }
}