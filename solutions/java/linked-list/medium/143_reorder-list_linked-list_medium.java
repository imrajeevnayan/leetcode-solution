class Solution {
    public void reorderList(ListNode head) {
        if (head == null || head.next == null) return;

        Deque<ListNode> stack = new ArrayDeque<>();
        ListNode curr = head;
        int count = 0;
        while (curr != null) {
            stack.push(curr);
            curr = curr.next;
            count++;
        }

        curr = head;
        for (int i = 0; i < count / 2; i++) {
            ListNode next = curr.next;      
            ListNode fromStack = stack.pop();
            curr.next = fromStack;           
            fromStack.next = next;            

            curr = next;                      
        }
        curr.next = null;
    }
}