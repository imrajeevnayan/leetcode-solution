class Solution {
  public:
    vector<int> distDigit(vector<int>& arr) {
        vector<int> ans;
        vector<bool> seen(10, false);

        for (int num : arr) {
            while (num > 0) {
                int digit = num % 10;
                seen[digit] = true;
                num /= 10;
            }
        }

        for (int i = 0; i <= 9; i++) {
            if (seen[i]) {
                ans.push_back(i);
            }
        }

        return ans;
    }
};