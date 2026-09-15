class Solution {
    public int maximum69Number (int num) {
        // 1. Integer ko String mein convert karo
        String s = String.valueOf(num);
        
        // 2. Pehla '6' dhundo aur usse '9' se replace karo
        // replaceFirst sirf first occurrence ko change karega
        String maxStr = s.replaceFirst("6", "9");
        
        // 3. Wapas Integer mein convert karo
        return Integer.parseInt(maxStr);
    }
}