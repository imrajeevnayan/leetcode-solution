class SmallestInfiniteSet {
    private int curr;
    private TreeSet<Integer> set;
    public SmallestInfiniteSet() {
        curr = 1;
        set = new TreeSet<>();
    }
    public int popSmallest() {
        if (!set.isEmpty()) {
            return set.pollFirst();
        }
        return curr++;
    }
    public void addBack(int num) {
        if (num < curr) {
            set.add(num);
        }
    }
}