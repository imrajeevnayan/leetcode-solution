class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        
        // increasing aur decreasing streak ki length
        int inc = 1;
        int dec = 1;

        // minimum answer 1 hoga (single element)
        int ans = 1;

        // array ko traverse karo
        for (int i = 1; i < nums.length; i++) {

            // agar current element bada hai
            // to increasing streak continue hogi
            if (nums[i] > nums[i - 1]) {
                inc++;      // increasing count badhao
                dec = 1;    // decreasing break ho gayi
            }

            // agar current element chota hai
            // to decreasing streak continue hogi
            else if (nums[i] < nums[i - 1]) {
                dec++;      // decreasing count badhao
                inc = 1;    // increasing break ho gayi
            }

            // dono equal hain
            // to dono streak reset
            else {
                inc = 1;
                dec = 1;
            }

            // har step par max length update karo
            ans = Math.max(ans, Math.max(inc, dec));
        }

        return ans;
    }
}