class Solution {
    private static final int[]    V = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
    private static final String[] S = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
    public String intToRoman(int num) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < V.length; i++) {
            while (num >= V[i]) {
                sb.append(S[i]);
                num -= V[i];
            }
        }
        return sb.toString();
    }
}