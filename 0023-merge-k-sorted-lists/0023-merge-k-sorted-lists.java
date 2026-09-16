class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        // Min-heap: sabse chhota val top pe
        PriorityQueue<ListNode> pq = new PriorityQueue<>((a, b) -> a.val - b.val);
        
        // har list ka head daalo
        for (ListNode node : lists) {
            if (node != null) pq.offer(node);
        }
        
        ListNode dummy = new ListNode(0);
        ListNode tail = dummy;
        
        while (!pq.isEmpty()) {
            ListNode min = pq.poll();   // globally smallest node
            tail.next = min;
            tail = tail.next;
            
            if (min.next != null) {     // us list ka next head daalo
                pq.offer(min.next);
            }
        }
        return dummy.next;
    }
}