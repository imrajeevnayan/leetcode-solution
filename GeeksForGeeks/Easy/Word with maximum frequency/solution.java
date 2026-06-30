class Solution {
    public String maximumFrequency(String s) {
        String[] words = s.split("\\s+");
        Map<String, Integer> freq = new LinkedHashMap<>();
        
        for (String word : words) {
            freq.put(word, freq.getOrDefault(word, 0) + 1);
        }
        
        int maxFreq = 0;
        String result = "";
        
        for (String word : freq.keySet()) {
            int count = freq.get(word);
            if (count > maxFreq) {
                maxFreq = count;
                result = word;
            }
        }
        
        return result + " " + maxFreq;
    }
}