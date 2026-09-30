class Solution {
    public TreeNode removeLeafNodes(TreeNode root, int target) {
        if (root == null) return null;


        // Pehle children ko process karo
        root.left = removeLeafNodes(root.left, target);
        root.right = removeLeafNodes(root.right, target);

        // Ab check karo ki current node leaf hai aur target hai
        if (root.left == null && root.right == null && root.val == target) {
            return null;
        }
        return root;
    }
}
