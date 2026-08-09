class Solution {
    public ArrayList<Integer> intersect(int[] a, int[] b) {
        ArrayList<Integer> result = new ArrayList<>();
        HashSet<Integer> set = new HashSet<>();
        for (int x : a) set.add(x);
        
        for (int x : b) {
            if (set.contains(x)) {
                result.add(x);
                set.remove(x);   // prevents duplicate
            }
        }

        return result;
    }
}