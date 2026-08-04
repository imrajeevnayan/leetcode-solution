class Solution {
    Node deleteK(Node head, int k) {
        if (head == null || k <= 1) {
            return k <= 1 ? null : head;
        }

        Node curr = head;
        Node prev = null;
        int count = 1;

        while (curr != null) {
            if (count % k == 0) {
                prev.next = curr.next;
                curr = curr.next;
            } else {
                prev = curr;
                curr = curr.next;
            }
            count++;
        }

        return head;
    }
}