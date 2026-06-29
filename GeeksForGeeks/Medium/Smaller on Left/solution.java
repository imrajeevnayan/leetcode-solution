class Complete {
    public static int[] Smallestonleft(int arr[], int n) {
        int[] ans = new int[n];
        TreeSet<Integer> set = new TreeSet<>();
        for (int i = 0; i < n; i++) {
            Integer val = set.lower(arr[i]);

            if (val == null)
                ans[i] = -1;
            else
                ans[i] = val;

            set.add(arr[i]);
        }

        return ans;
    }
}