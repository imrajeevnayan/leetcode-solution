class Solution {
    public int minSwaps(int[] nums) {
        int n = nums.length;
        
        // Step 1: Create array of pairs (digitSum, originalIndex, value)
        int[][] arr = new int[n][3];
        for (int i = 0; i < n; i++) {
            arr[i][0] = digitSum(nums[i]); // digit sum
            arr[i][1] = i;                  // original index
            arr[i][2] = nums[i];            // original value
        }
        
        // Step 2: Sort by digitSum, then by value
        Arrays.sort(arr, (a, b) -> {
            if (a[0] != b[0]) return a[0] - b[0];
            return a[2] - b[2];
        });
        
        // Step 3: Find minimum swaps using cycle detection
        boolean[] visited = new boolean[n];
        int swaps = 0;
        
        for (int i = 0; i < n; i++) {
            // Agar already visited ya already correct position pe hai
            if (visited[i] || arr[i][1] == i) {
                continue;
            }
            
            // Cycle detect karo
            int cycleSize = 0;
            int j = i;
            
            while (!visited[j]) {
                visited[j] = true;
                j = arr[j][1]; // Next element in cycle
                cycleSize++;
            }
            
            // Ek cycle of size k mein (k-1) swaps chahiye
            if (cycleSize > 1) {
                swaps += (cycleSize - 1);
            }
        }
        
        return swaps;
    }
    
    private int digitSum(int num) {
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }
}