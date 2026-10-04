class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        // Dummy node banao taaki head deletion bhi easily handle ho
        // Agar n == list length hai toh head hi delete hoga
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        
        ListNode fast = dummy;
        ListNode slow = dummy;
        
        // Step 1: Fast ko n+1 steps aage bhejo
        // n+1 isliye kyunki slow ko DELETE TARGET KE PEECHE rukna hai
        for (int i = 0; i <= n; i++) {
            fast = fast.next;
        }
        
        // Step 2: Dono ko ek saath chalao jab tak fast null na ho jaye
        while (fast != null) {
            fast = fast.next;
            slow = slow.next;
        }
        
        // Step 3: Ab slow ke next ko skip karo (delete)
        // slow ab delete target ke PEHLE wale node pe hai
        slow.next = slow.next.next;
        
        return dummy.next;
    }
}