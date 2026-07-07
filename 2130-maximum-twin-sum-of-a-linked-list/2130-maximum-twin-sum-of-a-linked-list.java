class Solution {
    public int pairSum(ListNode head) {
        // Step 1: Find the middle of the linked list
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        // Step 2: Reverse the second half
        ListNode prev = null;

        while (slow != null) {
            ListNode next = slow.next;
            slow.next = prev;
            prev = slow;
            slow = next;
        }

        // Step 3: Compare twin nodes
        ListNode first = head;
        ListNode second = prev;

        int maxSum = 0;

        while (second != null) {

            int currSum = first.val + second.val;

            maxSum = Math.max(maxSum, currSum);

            first = first.next;
            second = second.next;
        }

        return maxSum;
    }
}