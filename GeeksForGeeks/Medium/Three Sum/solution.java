class Solution {
    public static ArrayList<ArrayList<Integer>> triplets(int[] arr) {
        Set<ArrayList<Integer>> set = new HashSet<>();
        int n = arr.length;
        
        for (int i = 0; i < n; i++) {
            Set<Integer> seen = new HashSet<>();
            
            for (int j = i + 1; j < n; j++) {
                int third = -arr[i] - arr[j];
                
                if (seen.contains(third)) {
                    ArrayList<Integer> triplet = new ArrayList<>();
                    triplet.add(arr[i]);
                    triplet.add(arr[j]);
                    triplet.add(third);
                    
                    Collections.sort(triplet);        // Sort individual triplet
                    set.add(triplet);
                }
                seen.add(arr[j]);
            }
        }
        
        // Convert to List and sort all triplets lexicographically
        ArrayList<ArrayList<Integer>> result = new ArrayList<>(set);
        result.sort((a, b) -> {
            for (int k = 0; k < 3; k++) {
                if (!a.get(k).equals(b.get(k))) {
                    return a.get(k) - b.get(k);
                }
            }
            return 0;
        });
        
        return result;
    }
}