class Solution {
    public TreeNode balanceBST(TreeNode root) {
        ArrayList<Integer> arr = new ArrayList<>();
        inorder(root, arr);
        return build(arr, 0, arr.size() - 1);
    }

    void inorder(TreeNode root, ArrayList<Integer> arr) {
        if (root == null)return;
        inorder(root.left, arr);
        arr.add(root.val);
        inorder(root.right, arr);
    }

    TreeNode build(ArrayList<Integer> arr, int l, int r) {
        if (l > r) return null;
        int mid = (l + r) / 2;
        TreeNode root = new TreeNode(arr.get(mid));
        root.left = build(arr, l, mid - 1);
        root.right = build(arr, mid + 1, r);
        return root;
    }
}