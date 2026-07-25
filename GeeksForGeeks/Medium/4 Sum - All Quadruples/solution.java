class Solution {
    public ArrayList<ArrayList<Integer>> fourSum(int[] arr, int target) {
        Arrays.sort(arr);
        Set<ArrayList<Integer>> result = new HashSet<>();
        int n = arr.length;
        for (int i = 0; i < n - 3; i++) {
            for (int j = i + 1; j < n - 2; j++) {
                HashSet<Integer> seen = new HashSet<>();
                for (int k = j + 1; k < n; k++) {
                    long fourth = (long) target - arr[i] - arr[j] - arr[k];
                    if (seen.contains((int) fourth)) {
                        ArrayList<Integer> temp = new ArrayList<>();
                        temp.add(arr[i]);
                        temp.add(arr[j]);
                        temp.add((int) fourth);
                        temp.add(arr[k]);

                        Collections.sort(temp); // Ensure same order
                        result.add(temp);
                    }
                    seen.add(arr[k]);
                }
            }
        }
        return new ArrayList<>(result);
    }
}