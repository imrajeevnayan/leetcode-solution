class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        Set<Integer>s=new HashSet<>();
        List<Integer>li=new ArrayList<>();
        for(int n :nums){
            if(!s.add(n))li.add(n);
        }
        return li;
    }
}