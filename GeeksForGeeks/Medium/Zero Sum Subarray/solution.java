class Solution {
    public boolean subArrayExists(int arr[]) {
        Set<Integer> set = new HashSet<>();
                int ans = 0;

                for (int num : arr) {
                    ans += num;

                    // Agar prefix 0 ho ya pehle aa chuka ho
                    if (ans == 0 || set.contains(ans)) {
                        return true;
                    }

                    set.add(ans);
                }

        return false;
    }
}