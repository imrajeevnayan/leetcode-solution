import java.util.*;

class Solution {
    public ArrayList<Integer> primeFrequency(int[] arr, int k) {
        ArrayList<Integer> ans = new ArrayList<>();
        HashMap<Integer, Integer> freq = new HashMap<>();

        // Count frequency
        for (int x : arr) {
            freq.put(x, freq.getOrDefault(x, 0) + 1);
        }

        // Check every unique element
        for (int x : freq.keySet()) {
            int count = freq.get(x);

            if (count >= k && isPrime(count)) {
                ans.add(x);
            }
        }
        Collections.sort(ans);

        return ans;
    }

    private boolean isPrime(int n) {
        if (n < 2) {
            return false;
        }

        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }
}