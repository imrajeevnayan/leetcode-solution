class Tree {
    ArrayList<Integer> postOrder(Node node) {
        ArrayList<Integer> ans = new ArrayList<>();
        postorder(node, ans);
        return ans;
    }
    private void postorder(Node node, ArrayList<Integer> ans) {
        if (node == null)return;
        postorder(node.left, ans);   // Left
        postorder(node.right, ans);  // Right
        ans.add(node.data);          // Root
    }
}