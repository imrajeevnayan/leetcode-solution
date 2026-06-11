class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
        if (head == null || k == 1) return head;
        ListNode temp = null, newHead = null;

        while (true) {
            ListNode kthNode = head;
            for (int i = 1; i < k && kthNode != null; i++)  kthNode = kthNode.next;
            if (kthNode == null) break;

            ListNode nextGroupStart = kthNode.next;
            ListNode prev = nextGroupStart, curr = head;
            while (curr != nextGroupStart) {
                ListNode next = curr.next;
                curr.next = prev;
                prev = curr;
                curr = next;
            }
            if (temp == null) newHead = prev;
            else temp.next = prev;
            temp = head;
            head = nextGroupStart;
        }
        return newHead != null ? newHead : head;
    }
}