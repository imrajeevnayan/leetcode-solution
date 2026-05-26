import java.util.*;

class Solution {
    public ArrayList<Integer> spirallyTraverse(int[][] mat) {
        
        ArrayList<Integer> ans = new ArrayList<>();
        
        int top = 0;
        int bottom = mat.length - 1;
        int left = 0;
        int right = mat[0].length - 1;
        
        while(top <= bottom && left <= right) {
            
            // top row
            for(int i = left; i <= right; i++) {
                ans.add(mat[top][i]);
            }
            top++;
            
            // right column
            for(int i = top; i <= bottom; i++) {
                ans.add(mat[i][right]);
            }
            right--;
            
            // bottom row
            if(top <= bottom) {
                for(int i = right; i >= left; i--) {
                    ans.add(mat[bottom][i]);
                }
                bottom--;
            }
            
            // left column
            if(left <= right) {
                for(int i = bottom; i >= top; i--) {
                    ans.add(mat[i][left]);
                }
                left++;
            }
        }
        
        return ans;
    }
}