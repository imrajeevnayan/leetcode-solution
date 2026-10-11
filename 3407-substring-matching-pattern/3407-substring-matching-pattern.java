class Solution {
    public boolean hasMatch(String s, String p) {
        // 1. Pattern ko '*' se split karo
        // parts[0] = prefix, parts[1] = suffix
        String[] parts = p.split("\\*", -1);
        String prefix = parts[0];
        String suffix = parts[1];
        
        // 2. Edge case: agar pattern sirf "*" hai
        if (prefix.isEmpty() && suffix.isEmpty()) return true;
        
        // 3. 's' mein har possible position check karo
        for (int i = 0; i <= s.length() - prefix.length(); i++) {
            
            // Kya yahan prefix match ho raha hai?
            if (s.startsWith(prefix, i)) {
                
                // Prefix mil gaya! Ab check karo ki iske BAAD suffix bhi hai ya nahi
                // indexOf(suffix, startIndex) exactly yahi karta hai
                int suffixPos = s.indexOf(suffix, i + prefix.length());
                
                // Agar suffix mil gaya (position != -1), toh answer TRUE
                if (suffixPos != -1) {
                    return true;
                }
            }
        }
        
        // Kahin bhi valid combination nahi mila
        return false;
    }
}