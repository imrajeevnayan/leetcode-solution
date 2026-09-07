class Solution {
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> ans = new ArrayList<>();
        solve(root, "", ans);
        return ans;
    }
    void solve(TreeNode root, String path, List<String> ans) {
        if (root == null)  return;
        // Current node path mein add karo
        if (path.equals("")) {
            path = "" + root.val;
        } else {
            path = path + "->" + root.val;
        }
        // Leaf node
        if (root.left == null && root.right == null) {
            ans.add(path);
            return;
        }
        // Left aur Right mein jao
        solve(root.left, path, ans);
        solve(root.right, path, ans);
    }
}
