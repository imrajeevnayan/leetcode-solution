class Solution {
    public int majorityElement(int[] nums) {
          int candidate = 0;
          int count = 0;
    
        for (int num : nums) {
        if (count == 0) {
            candidate = num; // Naya candidate choose karo
        }
        
        if (num == candidate) {
            count++;   // Same element → vote badhao
        } else {
            count--;   // Different element → vote cancel karo
        }
    }
    
    return candidate;
        
    }
}