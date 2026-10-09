class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        // 1. Edge Cases Handle Karo (Safety First!)
        if (head == null || head.next == null || k == 0) return head;
        
        // 2. Length Find Karo aur Tail Node Pakdo
        ListNode tail = head;
        int length = 1;
        while (tail.next != null) {
            tail = tail.next;
            length++;
        }

        // 3. Effective K Calculate Karo (Optimization)
        k = k % length;
        if (k == 0) return head; // Agar k length ka multiple hai, toh list wapas same aa jayegi
        // 4. Circular Linked List Banao
        tail.next = head;

        // 5. New Tail Find Karo (Right Rotation ke liye: length - k steps)
        // Humein us node tak jaana hai jiska next 'new head' hoga
        ListNode newTail = head;
        for (int i = 0; i < length - k - 1; i++) {
            newTail = newTail.next;
        }

        // 6. Circle Todo aur New Head Set Karo
        ListNode newHead = newTail.next;
        newTail.next = null; // Breaking the cycle is crucial!

        return newHead;
    }
}