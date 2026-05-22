import java.util.*;

class Solution {

    ArrayList<String> ans = new ArrayList<>();
    int[] dr = {1, 0, 0, -1};
    int[] dc = {0, -1, 1, 0};
    char[] dir = {'D', 'L', 'R', 'U'};

    public ArrayList<String> ratInMaze(int[][] maze) {

        int n = maze.length;

        if (maze[0][0] == 0) return ans;

        dfs(0, 0, maze, n, "");

        return ans;
    }

    void dfs(int r, int c, int[][] maze, int n, String path) {

        if (r == n - 1 && c == n - 1) {
            ans.add(path);
            return;
        }

        maze[r][c] = 0; // visited

        for (int i = 0; i < 4; i++) {

            int nr = r + dr[i];
            int nc = c + dc[i];

            if (nr >= 0 && nc >= 0 && nr < n && nc < n
                    && maze[nr][nc] == 1) {

                dfs(nr, nc, maze, n, path + dir[i]);
            }
        }

        maze[r][c] = 1; // backtrack
    }
}