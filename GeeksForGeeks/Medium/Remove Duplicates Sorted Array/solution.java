class Solution {
    ArrayList<Integer> removeDuplicates(int[] arr) {
        TreeSet<Integer>s=new TreeSet<>();
        for(int n:arr) s.add(n);
        return new ArrayList<>(s);
    }
}