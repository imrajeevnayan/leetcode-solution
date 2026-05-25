class Solution {
    public static ArrayList<Integer> findUnion(int a[], int b[]) {
        TreeSet<Integer>set=new TreeSet<>();
        for(int x :a)set.add(x);
        for(int y: b)set.add(y);
        return new ArrayList<>(set);
    }
}
