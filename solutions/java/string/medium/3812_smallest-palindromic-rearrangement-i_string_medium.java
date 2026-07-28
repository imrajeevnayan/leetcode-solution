class Solution {
    public String smallestPalindrome(String s) {
        int cnt[] = new int[26];
        for(char c : s.toCharArray()){
            cnt[c-'a']++;
        }
        StringBuilder sb = new StringBuilder();
        char extra = ' ';
        for(char c = 'a';c<='z';c++){
            while(cnt[c-'a'] > 1){
                cnt[c-'a'] -= 2;
                sb.append(c);
            }
            if(cnt[c-'a'] == 1){
                extra = c;
            }
        }
        return sb.toString() + (extra == ' ' ? "" : extra) + sb.reverse().toString();
    }
}