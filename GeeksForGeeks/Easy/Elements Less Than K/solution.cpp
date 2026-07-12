class Solution {
  public:
    vector<int> list_less_than_k(vector<int> &arr, int k) {
        vector<int> ans;

        for (int x : arr) {
            if (x < k) {
                ans.push_back(x);
            }
        }

        return ans;
    }
};