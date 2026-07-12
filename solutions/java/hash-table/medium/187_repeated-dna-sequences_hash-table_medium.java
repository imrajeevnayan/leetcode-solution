class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        Set<String> seen = new HashSet<>();
        Set<String> rep= new HashSet<>();
        int k = 10;
        
        for (int i = 0; i <= s.length() - k; i++) {
            String sub = s.substring(i, i + k);
            if (!seen.add(sub)) rep.add(sub);
        }
        return new ArrayList<>(rep);
    }
}