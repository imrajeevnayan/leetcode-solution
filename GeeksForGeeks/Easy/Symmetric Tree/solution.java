class Solution {
    public boolean isSymmetric(Node root) {
        if (root == null) return true;
        return check(root.left, root.right);
    }
    private boolean check(Node a, Node b) {
        if (a == null && b == null) return true;
        if (a == null || b == null) return false;
        if (a.data != b.data) return false;
        return check(a.left, b.right) && check(a.right, b.left);
    }
}