class Solution {
    public ArrayList<Integer> rightView(Node root) {
        ArrayList<Integer> ans = new ArrayList<>();
        solve(root, 0, ans);
        return ans;
    }
    void solve(Node root, int level, ArrayList<Integer> ans) {
        if (root == null)  return;
        
        // Is level par pehli baar aaye hain
        if (level == ans.size()) {
            ans.add(root.data);
        }

        // Pehle right jao
        solve(root.right, level + 1, ans);

        // Phir left jao
        solve(root.left, level + 1, ans);
    }
}
