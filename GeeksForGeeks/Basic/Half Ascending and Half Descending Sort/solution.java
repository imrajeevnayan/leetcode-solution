class Solution {
    public ArrayList<Integer> customSort(int[] arr) {
        ArrayList<Integer> ans = new ArrayList<>();

        int n = arr.length;
        int mid = n / 2;

        int[] first = new int[mid];
        int[] second = new int[n - mid];

        for (int i = 0; i < mid; i++) {
            first[i] = arr[i];
        }

        for (int i = mid; i < n; i++) {
            second[i - mid] = arr[i];
        }

        Arrays.sort(first);
        Arrays.sort(second);

        for (int i = 0; i < mid; i++) {
            ans.add(first[i]);
        }

        for (int i = second.length - 1; i >= 0; i--) {
            ans.add(second[i]);
        }

        return ans;
    }
}