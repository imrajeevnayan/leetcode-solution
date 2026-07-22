class Solution {
    public static void flatten(Node root) {
        Node curr = root;
        while (curr != null) {
            if (curr.left != null) {
                Node temp = curr.left;

                while (temp.right != null) {
                    temp = temp.right;
                }
                temp.right = curr.right;

                curr.right = curr.left;
                curr.left = null;
            }
            curr = curr.right;
        }
    }
}