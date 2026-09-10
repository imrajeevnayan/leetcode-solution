class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        // nums1 ke valid elements
        for (int i = 0; i < m; i++) {
            pq.add(nums1[i]);
        }

        // nums2 ke elements
        for (int i = 0; i < n; i++) {
            pq.add(nums2[i]);
        }

        // Sorted order mein nums1 mein daal do
        for (int i = 0; i < m + n; i++) {
            nums1[i] = pq.poll();
        }
    }
}
