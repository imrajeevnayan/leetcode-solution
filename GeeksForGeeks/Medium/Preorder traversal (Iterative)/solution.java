class Solution {
    ArrayList<Integer> preOrder(Node root) {
        ArrayList<Integer> ans = new ArrayList<>();
        preorder(root, ans);
        return ans;
    }
    private void preorder(Node root, ArrayList<Integer> ans) {
        if (root == null) return;
        ans.add(root.data);      // Root
        preorder(root.left, ans); // Left
        preorder(root.right, ans);// Right
    }
}