class Solution {
    public List<Integer> twoSum(int arr[], int target) {
        Map<Integer,Integer>map=new HashMap<>();
        ArrayList<Integer>ans=new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            int rem=target-arr[i];
            if(map.containsKey(rem)){
                ans.add(rem);
                ans.add(arr[i]);
                return ans;
            }
            map.put(arr[i],i);
        }
        return ans;
    }
}