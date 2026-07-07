class Solution {
    public int pairSum(ListNode head) {
        Stack<Integer> stack = new Stack<>();
        ListNode curr = head;
        int length = 0;
        // Push all values into stack
        while (curr != null) {
            stack.push(curr.val);
            curr = curr.next;
            length++;
        }
        curr = head;
        int maxSum = 0;
        // Process only first half
        for (int i = 0; i < length / 2; i++) {
            int currSum = curr.val + stack.pop();
            maxSum = Math.max(maxSum, currSum);
            curr = curr.next;
        }
        return maxSum;
    }
}