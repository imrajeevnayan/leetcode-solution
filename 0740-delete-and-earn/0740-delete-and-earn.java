class Solution {
    int[] points;
    int[] dp; // Memoization array

    public int deleteAndEarn(int[] nums) {
        // Step 1: Points array banao
        int maxVal = 0;
        for (int num : nums) maxVal = Math.max(maxVal, num);
        
        points = new int[maxVal + 1];
        for (int num : nums) {
            points[num] += num; // Value * Frequency
        }
        
        // Step 2: DP array initialize karo
        dp = new int[maxVal + 1];
        Arrays.fill(dp, -1);
        
        // Step 3: Last index se start karo (Top-Down)
        return solve(maxVal);
    }
    
    private int solve(int idx) {
        // Base Case: Index negative ho gaya toh 0
        if (idx < 0) return 0;
        
        // Memoization Check
        if (dp[idx] != -1) return dp[idx];
        
        // CHOICE 1: SKIP current index
        // Current mat lo, seedha pichle index pe jao
        int skip = solve(idx - 1);
        
        // CHOICE 2: TAKE current index
        // Current lo + uske bagal wale (idx-1) ko skip karke idx-2 pe jao
        int take = points[idx] + solve(idx - 2);
        
        // Max store karo aur return karo
        dp[idx] = Math.max(take, skip);
        return dp[idx];
    }
}