class Solution {
    public int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {
        
        // Pehle nums1 aur nums2 ke saare pair sums ka frequency map banao
        // Kyunki a+b+c+d=0 ko hum (a+b) = -(c+d) mein tod sakte hain
        Map<Integer, Integer> map = new HashMap<>();
        for (int a : nums1) {
            for (int b : nums2) {
                // Har a+b sum ki frequency badhao
                map.merge(a + b, 1, Integer::sum);
            }
        }
        
        // Ab nums3 aur nums4 ke har pair ke liye check karo
        // ki uska negative complement map mein kitni baar aaya tha
        int count = 0;
        for (int c : nums3) {
            for (int d : nums4) {
                // -(c+d) isliye kyunki a+b = -(c+d) hona chahiye tabhi total sum 0 hoga
                count += map.getOrDefault(-(c + d), 0);
            }
        }
        
        return count;
    }
}