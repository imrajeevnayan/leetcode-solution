class Solution {
    public int getKthFromLast(Node head, int k) {
        Node fast = head,slow = head;

        for (int i = 0; i < k; i++) {
            if (fast == null) {
                return -1; // k is greater than list length
            }
            fast = fast.next;
        }

        while (fast != null) {
            fast = fast.next;
            slow = slow.next;
        }
        return slow.data;
    }
}
