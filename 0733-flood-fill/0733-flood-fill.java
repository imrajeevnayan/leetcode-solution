class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        
        int originalColor = image[sr][sc];

        // Agar same color already hai, kuch karna hi nahi
        if (originalColor == color) {
            return image;
        }

        dfs(image, sr, sc, originalColor, color);

        return image;
    }

    private void dfs(int[][] image, int r, int c, int originalColor, int color) {

        // Boundary check
        if (r < 0 || r >= image.length ||
            c < 0 || c >= image[0].length) {
            return;
        }

        // Agar current cell original color ka nahi hai,
        // to isko fill nahi karna
        if (image[r][c] != originalColor) {
            return;
        }

        // Current cell ko new color de do
        image[r][c] = color;

        // 4 directions
        dfs(image, r - 1, c, originalColor, color); // up
        dfs(image, r + 1, c, originalColor, color); // down
        dfs(image, r, c - 1, originalColor, color); // left
        dfs(image, r, c + 1, originalColor, color); // right
    }
}
