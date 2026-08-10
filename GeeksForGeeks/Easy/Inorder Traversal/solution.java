class Solution {
    public ArrayList<Integer> inOrder(Node root) {
        ArrayList<Integer> ans = new ArrayList<>();
        if (root == null) return ans;
        ans.addAll(inOrder(root.left));
        ans.add(root.data);
        ans.addAll(inOrder(root.right));

        return ans;
    }
}