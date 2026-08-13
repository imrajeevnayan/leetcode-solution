class Solution {
    int[] pre, suf, best, len;
    char[] left, right;

    public int[] longestRepeating(String s, String queryCharacters, int[] queryIndices) {
        int n = s.length();

        pre = new int[4 * n];
        suf = new int[4 * n];
        best = new int[4 * n];
        len = new int[4 * n];
        left = new char[4 * n];
        right = new char[4 * n];

        build(1, 0, n - 1, s);

        int[] ans = new int[queryIndices.length];

        for (int i = 0; i < queryIndices.length; i++) {
            update(1, 0, n - 1, queryIndices[i],
                   queryCharacters.charAt(i));
            ans[i] = best[1];
        }

        return ans;
    }

    void build(int node, int l, int r, String s) {
        if (l == r) {
            pre[node] = suf[node] = best[node] = len[node] = 1;
            left[node] = right[node] = s.charAt(l);
            return;
        }

        int mid = (l + r) / 2;

        build(node * 2, l, mid, s);
        build(node * 2 + 1, mid + 1, r, s);

        merge(node);
    }

    void update(int node, int l, int r, int idx, char c) {
        if (l == r) {
            left[node] = right[node] = c;
            return;
        }

        int mid = (l + r) / 2;

        if (idx <= mid)
            update(node * 2, l, mid, idx, c);
        else
            update(node * 2 + 1, mid + 1, r, idx, c);

        merge(node);
    }

    void merge(int node) {
        int a = node * 2;
        int b = node * 2 + 1;

        len[node] = len[a] + len[b];
        left[node] = left[a];
        right[node] = right[b];

        pre[node] = pre[a];
        suf[node] = suf[b];
        best[node] = Math.max(best[a], best[b]);

        if (right[a] == left[b]) {
            best[node] = Math.max(best[node], suf[a] + pre[b]);

            if (pre[a] == len[a])
                pre[node] = len[a] + pre[b];

            if (suf[b] == len[b])
                suf[node] = len[b] + suf[a];
        }
    }
}