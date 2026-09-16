class Solution {

    public TreeNode lcaDeepestLeaves(TreeNode root) {
        return solve(root).node;
    }

    class Pair {
        TreeNode node;
        int depth;

        Pair(TreeNode node, int depth) {
            this.node = node;
            this.depth = depth;
        }
    }

    Pair solve(TreeNode root) {

        // Null node
        if (root == null) {
            return new Pair(null, 0);
        }

        // Left aur right subtree solve karo
        Pair left = solve(root.left);
        Pair right = solve(root.right);

        // Left subtree deeper hai
        if (left.depth > right.depth) {
            return new Pair(left.node, left.depth + 1);
        }

        // Right subtree deeper hai
        if (right.depth > left.depth) {
            return new Pair(right.node, right.depth + 1);
        }

        // Dono ki depth same hai
        // Current node deepest leaves ka LCA hoga
        return new Pair(root, left.depth + 1);
    }
}
