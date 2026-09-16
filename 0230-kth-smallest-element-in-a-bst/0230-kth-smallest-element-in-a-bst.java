class Solution {
    public int kthSmallest(TreeNode root, int k) {

        Stack<TreeNode> stack = new Stack<>();
        TreeNode curr = root;

        while (true) {

            // Left side ke nodes stack mein daalo
            while (curr != null) {
                stack.push(curr);
                curr = curr.left;
            }

            // Smallest remaining node
            curr = stack.pop();
            k--;

            // kth smallest mil gaya
            if (k == 0) {
                return curr.val;
            }

            // Ab right subtree explore karo
            curr = curr.right;
        }
    }
}