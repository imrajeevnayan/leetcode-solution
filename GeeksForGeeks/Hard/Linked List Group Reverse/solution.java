class Solution {
    public Node reverseKGroup(Node head, int k) {
        Node curr = head, prev = null, next = null;
        int count = 0;

        while (curr != null && count < k) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
            count++;
        }

        if (curr != null)
            head.next = reverseKGroup(curr, k);

        return prev;
    }
}
