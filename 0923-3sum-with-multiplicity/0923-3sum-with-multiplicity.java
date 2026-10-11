class Solution {
    public int threeSumMulti(int[] arr, int target) {
        final int MOD = 1_000_000_007;
        long[] count = new long[101]; // Values are 0-100
        
        // Step 1: Frequency map banao
        for (int num : arr) {
            count[num]++;
        }
        
        long result = 0;
        
        // Step 2: Do numbers fix karo (i <= j <= k maintain karne ke liye)
        // Isse duplicate counting automatically avoid hoti hai
        for (int i = 0; i <= 100; i++) {
            if (count[i] == 0) continue;
            
            for (int j = i; j <= 100; j++) {
                if (count[j] == 0) continue;
                
                int k = target - i - j;
                
                // k valid range mein hona chahiye aur ordering maintain karni hai
                if (k < j || k > 100) continue; 
                if (count[k] == 0) continue;
                
                // Step 3: Combinations calculate karo based on equality cases
                if (i == j && j == k) {
                    // Case 1: All three same (e.g., 5,5,5)
                    // Formula: C(n, 3) = n * (n-1) * (n-2) / 6
                    result += count[i] * (count[i] - 1) * (count[i] - 2) / 6;
                    
                } else if (i == j) {
                    // Case 2: First two same (e.g., 5,5,8)
                    // Formula: C(n, 2) * m
                    result += count[i] * (count[i] - 1) / 2 * count[k];
                    
                } else if (j == k) {
                    // Case 3: Last two same (e.g., 5,8,8)
                    // Formula: n * C(m, 2)
                    result += count[i] * count[j] * (count[j] - 1) / 2;
                    
                } else {
                    // Case 4: All distinct (e.g., 5,8,12)
                    // Formula: n * m * p
                    result += count[i] * count[j] * count[k];
                }
                
                result %= MOD;
            }
        }
        
        return (int) result;
    }
}