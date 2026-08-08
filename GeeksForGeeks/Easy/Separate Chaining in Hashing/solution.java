class Solution {
    public ArrayList<ArrayList<Integer>> separateChaining(int[] arr, int m) {
        
        ArrayList<ArrayList<Integer>> table = new ArrayList<>();

        // Create m empty buckets
        for (int i = 0; i < m; i++) {
            table.add(new ArrayList<>());
        }

        // Insert elements using chaining
        for (int num : arr) {
            int index = num % m;
            table.get(index).add(num);
        }

        return table;
    }
}