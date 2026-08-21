class Solution {
    public int[] checkQueries(TrieNode root, String[] arr, String[] queries) {
        // Insert all words from arr into the Trie
        for (String word : arr) {
            Main.insert(root, word);
        }

        // Check each query
        int[] ans = new int[queries.length];

        for (int i = 0; i < queries.length; i++) {
            ans[i] = Main.search(root, queries[i]) ? 1 : 0;
        }

        return ans;
    }
}
