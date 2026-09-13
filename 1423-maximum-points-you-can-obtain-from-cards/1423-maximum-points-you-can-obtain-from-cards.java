class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int n = cardPoints.length;
        
        // Pehle k cards ka sum (saare left se)
        int windowSum = 0;
        for (int i = 0; i < k; i++) {
            windowSum += cardPoints[i];
        }
        
        int maxSum = windowSum;
        
        // Ab slide karo: left se hatao, right se add karo
        int right = n - 1;
        for (int i = k - 1; i >= 0; i--) {
            windowSum -= cardPoints[i];          // left se hatao
            windowSum += cardPoints[right];      // right se add karo
            right--;
            
            maxSum = Math.max(maxSum, windowSum);
        }
        
        return maxSum;
    }
}