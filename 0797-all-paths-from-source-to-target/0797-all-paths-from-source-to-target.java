class Solution {
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        List<List<Integer>> result = new ArrayList<>();
        Queue<List<Integer>> q = new LinkedList<>();

        List<Integer> startPath = new ArrayList<>();
        startPath.add(0);
        q.offer(startPath);

        int target = graph.length - 1;

        while (!q.isEmpty()) {
            List<Integer> path = q.poll();

            int node = path.get(path.size() - 1);

            // Target reached
            if (node == target) {
                result.add(path);
                continue;
            }

            // Add all neighbours
            for (int next : graph[node]) {
                List<Integer> newPath = new ArrayList<>(path);
                newPath.add(next);

                q.offer(newPath);
            }
        }

        return result;
    }
}
