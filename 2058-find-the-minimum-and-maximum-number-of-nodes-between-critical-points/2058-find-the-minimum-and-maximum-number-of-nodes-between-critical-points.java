class Solution {
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        int first = -1,prev = -1,min = Integer.MAX_VALUE,max = -1,index = 1;
        ListNode curr = head.next;

        while (curr != null && curr.next != null) {
            if ((curr.val > curr.next.val && curr.val > head.val) ||
                (curr.val < curr.next.val && curr.val < head.val)) {

                if (first == -1) first = index;
               else {
                    min = Math.min(min, index - prev);
                    max = index - first;
                }
                prev = index;
            }
            head = curr;
            curr = curr.next;
            index++;
        }
        if (max == -1) return new int[]{-1, -1};
        return new int[]{min, max};
    }
}