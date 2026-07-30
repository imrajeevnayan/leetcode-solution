class Solution {
    public ArrayList<Integer> getSortedOrder(Node root) {
        ArrayList<Integer> ans = new ArrayList<>();
        inorder(root, ans);
        return ans;
    }
    private void inorder(Node root, ArrayList<Integer> ans) {
        if (root == null) return;
        inorder(root.left, ans);
        ans.add(root.data);
        inorder(root.right, ans);
    }
}