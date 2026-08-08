class Solution {
    int minEdgesReq(int n, int[][] edges) {
        int[] p = new int[n];
        int[] size = new int[n];

        for (int i = 0; i < n; i++) {
            p[i] = i;
            size[i] = 1;
        }

        int extra = 0;

        for (int[] e : edges) {
            int a = find(p, e[0]);
            int b = find(p, e[1]);

            if (a == b) {
                extra++;
            } else {
                if (size[a] < size[b]) {
                    int t = a; a = b; b = t;
                }
                p[b] = a;
                size[a] += size[b];
            }
        }

        int components = 0;
        for (int i = 0; i < n; i++)
            if (find(p, i) == i)
                components++;

        int need = components - 1;

        return extra >= need ? need : -1;
    }

    int find(int[] p, int x) {
        if (p[x] != x)
            p[x] = find(p, p[x]);
        return p[x];
    }
}