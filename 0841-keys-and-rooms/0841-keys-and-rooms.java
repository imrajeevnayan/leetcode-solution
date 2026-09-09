class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        int n = rooms.size();
        boolean[] visited = new boolean[n];
        Queue<Integer> queue = new ArrayDeque<>();
        // Start from Room 0
        visited[0] = true;
        queue.offer(0);

        while (!queue.isEmpty()) {
            int currRoom = queue.poll();
            // Current room ki saari keys
            for (int key : rooms.get(currRoom)) {
                // Agar room pehle visit nahi hua
                if (!visited[key]) {
                    visited[key] = true;
                    queue.offer(key);
                }
            }
        }
        // Check whether all rooms were visited
        for (boolean visit : visited) {
            if (!visit) return false;
        }
        return true;
    }
}
