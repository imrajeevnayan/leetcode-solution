class Solution {
    String removeDuplicates(String s) {
        StringBuilder sb=new StringBuilder();
        Set<Character>set=new HashSet<>();
        for(char c:s.toCharArray()){
            if(set.add(c))sb.append(c);
        }
        return sb.toString();
    }
}
