class Solution {
    public static int intersectSize(int a[], int b[]) {
        int count=0;
        Map<Integer,Integer>map=new HashMap<>();
        for(int n :a)map.put(n,map.getOrDefault(n,0)+1);
        for(int n :b){
            if(map.containsKey(n)) count++;
        }
        return count;
    }
}