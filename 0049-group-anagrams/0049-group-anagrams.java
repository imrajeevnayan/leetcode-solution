class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
      HashMap<String,List<String>>ans=new HashMap<>();
        for(String s:strs){
            char c[]=s.toCharArray();
            Arrays.sort(c);
            String key=String.valueOf(c);
            ans.computeIfAbsent(key,k->new ArrayList<>()).add(s);
        }
        return new ArrayList<>(ans.values());
    }
}