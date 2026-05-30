class Solution {
    boolean hasPathSum(Node root, int target) {
     if (root == null) return false;
     if (root.left == null && root.right == null) return root.data == target;
        
        int rem = target - root.data;
        return hasPathSum(root.left, rem) || hasPathSum(root.right,rem);
    }
}