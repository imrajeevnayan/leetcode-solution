class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set = new HashSet<>();
        // Add all elements of nums1 to set
        for (int num : nums1) {
            set.add(num);
        }
        
        List<Integer> resultList = new ArrayList<>();
        // Check nums2 elements
        for (int num : nums2) {
            if (set.contains(num)) {
                resultList.add(num);
                set.remove(num); // Remove taaki duplicate na aaye
            }
        }
        
        // Convert List to Array
        int[] result = new int[resultList.size()];
        for (int i = 0; i < resultList.size(); i++) {
            result[i] = resultList.get(i);
        }
        
        return result;
    }
}