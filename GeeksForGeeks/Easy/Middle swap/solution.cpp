class Solution {
  public:
    void middleSwap(int arr[4][4]) {
        
        // Swap 2nd and 3rd rows
        for (int j = 0; j < 4; j++) {
            swap(arr[1][j], arr[2][j]);
        }

        // Swap 2nd and 3rd columns
        for (int i = 0; i < 4; i++) {
            swap(arr[i][1], arr[i][2]);
        }
    }
};
