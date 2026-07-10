class Solution {
    static boolean findsum(int arr[]) {
        Map<Integer,Integer>map=new HashMap<>();
        map.put(0,1);
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            if(map.containsKey(sum)) return true;
            else map.put(sum, map.getOrDefault(sum, 0) + 1);
        }
        return false;
    }
}