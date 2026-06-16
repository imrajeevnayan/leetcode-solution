class Solution {
    static int countdigit(int num) {
        int count = 0;
        if (num == 0) return 1; 
        while (num > 0) {
            count++;
            num /= 10;
        }
        return count;
    }

    public int findNumbers(int[] nums) {
        int c = 0;
        for (int i = 0; i < nums.length; i++) {
            if (countdigit(nums[i]) % 2 == 0) {
                c++;
            }
        }
        return c;
    }
}