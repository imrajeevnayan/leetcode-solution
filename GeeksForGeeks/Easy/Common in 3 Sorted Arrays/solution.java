class Solution {
    public ArrayList<Integer> commonElements(int[] a, int[] b, int[] c) {
        ArrayList<Integer> result = new ArrayList<>();
        int i = 0, j = 0, k = 0;
        int n = a.length, m = b.length, p = c.length;
        
        while (i < n && j < m && k < p) {
            if (a[i] == b[j] && b[j] == c[k]) {
                // Skip duplicates in result
                if (result.isEmpty() || result.get(result.size() - 1) != a[i]) {
                    result.add(a[i]);
                }
                i++; j++; k++;
            }
            else if (a[i] < b[j]) {
                i++;
            } else if (b[j] < c[k]) {
                j++;
            } else {
                k++;
            }
        }
        return result;
    }
}