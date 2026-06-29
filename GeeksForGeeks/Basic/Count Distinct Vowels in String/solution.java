class Solution {
    static boolean isVowel(char c) {
        c = Character.toLowerCase(c);
        return "aeiou".indexOf(c) != -1;
    }
    public int countVowels(String s) {
        HashSet<Character> set = new HashSet<>();
        for (char c : s.toCharArray()) {
            if (isVowel(c)) {
                set.add(Character.toLowerCase(c));
            }
        }

        return set.size();
        
    }
}