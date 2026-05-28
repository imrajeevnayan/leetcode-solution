class Solution {
    public boolean isIdentical(int[] a, int[] b) {
     Arrays.sort(a);
     Arrays.sort(b);
     return Arrays.equals(a,b);
    }
}