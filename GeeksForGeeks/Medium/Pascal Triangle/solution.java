class Solution {
    ArrayList<Integer> nthRowOfPascalTriangle(int n) {
        ArrayList<Integer> res = new ArrayList<>();
        long val = 1;
        res.add(1);
        
        for (int i = 1; i < n; i++) {
            val = val * (n - i) / i;
            res.add((int) val);
        }
        
        return res;
    }
}