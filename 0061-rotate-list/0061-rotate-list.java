class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null || k == 0) return head;
        ListNode fast = head,slow = head;
        
        for (int i = 0; i < k; i++) {
            fast = fast.next;
            if (fast == null) fast = head; 
        }
       if (fast == head) return head;
        while (fast.next != null) {
            slow = slow.next;
            fast = fast.next;
        }
       ListNode newHead = slow.next;
        slow.next = null;
        fast.next = head;       
        return newHead;
    }
}