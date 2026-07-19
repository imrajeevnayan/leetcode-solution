class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        ArrayList<Integer>ans=new ArrayList<>();
        Set<Integer>s=new HashSet<>();
        for(int n:nums){
            if(!s.add(n)){
                ans.add(n);
            }
        }
        return ans;
    }
}