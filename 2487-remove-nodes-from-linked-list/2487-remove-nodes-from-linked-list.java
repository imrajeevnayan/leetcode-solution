class Solution {
    public ListNode removeNodes(ListNode head) {
        // Step 1: Reverse the list
        head = reverse(head);
        
        // Step 2: Traverse and keep nodes >= current max
        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;
        int maxVal = Integer.MIN_VALUE;
        
        while (head != null) {
            if (head.val >= maxVal) {
                maxVal = head.val;
                curr.next = head;
                curr = curr.next;
            }
            head = head.next;
        }
        curr.next = null; // Terminate the filtered list
        
        // Step 3: Reverse back to original order
        return reverse(dummy.next);
    }
    
    private ListNode reverse(ListNode head) {
        ListNode prev = null, curr = head;
        while (curr != null) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
}