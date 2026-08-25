class Solution {
    public ArrayList<Integer> boundaryTraversal(Node root) {
        ArrayList<Integer> ans = new ArrayList<>();
        if (root == null) return ans;

        ans.add(root.data);
        left(root.left, ans);
        leaves(root, ans);
        right(root.right, ans);

        return ans;
    }

    void left(Node p, ArrayList<Integer> a) {
        while (p != null) {
            if (p.left != null || p.right != null) a.add(p.data);
            p = p.left != null ? p.left : p.right;
        }
    }

    void leaves(Node p, ArrayList<Integer> a) {
        if (p == null) return;
        if (p.left == null && p.right == null) {
            if (!a.contains(p.data)) a.add(p.data);
            return;
        }
        leaves(p.left, a);
        leaves(p.right, a);
    }

    void right(Node p, ArrayList<Integer> a) {
        ArrayList<Integer> t = new ArrayList<>();
        while (p != null) {
            if (p.left != null || p.right != null) t.add(p.data);
            p = p.right != null ? p.right : p.left;
        }
        for (int i = t.size() - 1; i >= 0; i--) a.add(t.get(i));
    }
}
