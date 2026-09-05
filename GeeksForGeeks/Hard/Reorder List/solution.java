class Solution {
    public void reorderList(Node head) {
        if (head == null || head.next == null) {
            return;
        }

        // Step 1: Find middle
        Node slow = head;
        Node fast = head;

        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // Step 2: Reverse second half
        Node second = slow.next;
        slow.next = null;

        Node prev = null;
        Node curr = second;

        while (curr != null) {
            Node next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        second = prev;

        // Step 3: Merge both halves
        Node first = head;

        while (second != null) {
            Node firstNext = first.next;
            Node secondNext = second.next;

            first.next = second;
            second.next = firstNext;

            first = firstNext;
            second = secondNext;
        }
    }
}
