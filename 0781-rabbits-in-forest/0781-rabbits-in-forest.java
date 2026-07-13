class Solution {
    public int numRabbits(int[] answers) {
    HashMap<Integer,Integer>map=new HashMap<>();
    for(int n :answers)map.put(n,map.getOrDefault(n,0)+1);
    
    int total=0;
     for (int x : map.keySet()) {
            int v = map.get(x);
            int groupSize = x + 1;
            int groups = (v + groupSize - 1) / groupSize;
            total += groups * groupSize;
        }
        return total;
    }
}