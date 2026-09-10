class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {

        // nums2 ko nums1 ke end mein copy karo
        for (int i = 0; i < n; i++) {
            nums1[m + i] = nums2[i];
        }

        // Ab poore array ko sort karo
        Arrays.sort(nums1);
    }
}
