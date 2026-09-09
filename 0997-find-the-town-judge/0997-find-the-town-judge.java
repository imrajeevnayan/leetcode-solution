class Solution {
    public int findJudge(int n, int[][] trust) {
        int[] score = new int[n + 1];
        for (int[] t : trust) {
            int person = t[0];
            int judge = t[1];
            // person trusts someone
            score[person]--;
            // someone trusts judge
            score[judge]++;
        }

        for (int i = 1; i <= n; i++) {

            if (score[i] == n - 1) {
                return i;
            }
        }

        return -1;
    }
}