class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<>();

        for (int i = 0; i < numRows; i++) {
            List<Integer> row = new ArrayList<>();
            long ans = 1; 

            for (int j = 0; j <= i; j++) {
                row.add((int) ans);
                
                ans = ans * (i - j) / (j + 1);
            }
            res.add(row);
        }
        return res;
    }
}