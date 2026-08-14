class Solution {
    HashMap<Integer, Integer> dp = new HashMap<>();
    public int maxExchangeMoney(int n) {
        if (n <= 1) return n;
        
        if (dp.containsKey(n)) return dp.get(n);
        
        int ans = Math.max(n, 
            maxExchangeMoney(n / 2) +
            maxExchangeMoney(n / 3) +
            maxExchangeMoney(n / 4)
        );

        dp.put(n, ans);
        return ans;
    }
}