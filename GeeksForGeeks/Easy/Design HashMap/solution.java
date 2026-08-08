class MyHashMap {
    HashMap<Integer, Integer> map;
    MyHashMap() {
        map = new HashMap<>();
    }
    void put(int key, int value) {
        map.put(key, value);
    }
    int get(int key) {
        if (map.containsKey(key))  return map.get(key);
        return -1;
    }
    void remove(int key) {
        map.remove(key);
    }
}