class Solution {
    int count(long t, int x) {
    if (t < 2) return 0;
    int r = 0;
    while (t % x == 0) {
        t /= x;
        r++;
    }
    return r;
}
    String change(String s) {
        StringBuilder r = new StringBuilder(s);
        for (int i = 0; i < r.length(); i++) {
            if (r.charAt(i) == '0') {
                r.setCharAt(i, '1');
            }
        }
        return r.toString();
    }

    int[] make(int[] p) {
        int[] v = new int[10];

        v[2] = Math.max(p[2], 0);
        v[3] = Math.max(p[3], 0);
        v[5] = Math.max(p[5], 0);
        v[7] = Math.max(p[7], 0);

        v[9] = v[3] >> 1;
        v[3] &= 1;

        v[8] = v[2] / 3;
        v[2] %= 3;

        v[6] = Math.min(v[2], v[3]);
        v[2] -= v[6];
        v[3] -= v[6];

        v[4] = v[2] >> 1;
        v[2] &= 1;

        return v;
    }

    String join(int[] v) {
        StringBuilder r = new StringBuilder();

        for (int i = 1; i < 10; i++) {
            for (int j = 0; j < v[i]; j++) {
                r.append((char) ('0' + i));
            }
        }

        return r.toString();
    }

    public String smallestNumber(String num, long t) {

        int[] p = new int[10];

        // Factorize t (replacement for C++ reference behavior)
        while (t % 2 == 0) {
            p[2]++;
            t /= 2;
        }
        while (t % 3 == 0) {
            p[3]++;
            t /= 3;
        }
        while (t % 5 == 0) {
            p[5]++;
            t /= 5;
        }
        while (t % 7 == 0) {
            p[7]++;
            t /= 7;
        }

        if (t > 1) return "-1";

        long tt = 1;
        for (int i = 0; i < p[2]; i++) tt *= 2;
        for (int i = 0; i < p[3]; i++) tt *= 3;
        for (int i = 0; i < p[5]; i++) tt *= 5;
        for (int i = 0; i < p[7]; i++) tt *= 7;

        long s = 1;
        int n = num.length();

        int z = n;

        int[] need = p.clone();

        for (int i = 0; i < n; i++) {
            long x = num.charAt(i) - '0';

            if (x != 0) {
                s = (s * x) % tt;
            }

            if (z == n) {
                if (x == 0) {
                    z = i;
                }

                need[2] -= count(x, 2);
                need[3] -= count(x, 3);
                need[5] -= count(x, 5);
                need[7] -= count(x, 7);
            }
        }

        if (z == n && s == 0) {
            return num;
        }

        p = need;

        for (int i = (z == n ? n - 1 : z); i >= 0; i--) {

            int x = num.charAt(i) - '0';

            p[2] += count(x, 2);
            p[3] += count(x, 3);
            p[5] += count(x, 5);
            p[7] += count(x, 7);

            for (int next = x + 1; next < 10; next++) {

                p[2] -= count(next, 2);
                p[3] -= count(next, 3);
                p[5] -= count(next, 5);
                p[7] -= count(next, 7);

                int[] v = make(p);

                v[1] = n - 1 - i;

                for (int j = 2; j < 10 && v[1] >= 0; j++) {
                    v[1] -= v[j];
                }

                if (v[1] >= 0) {
                    return change(num.substring(0, i))
                            + next
                            + join(v);
                }

                p[2] += count(next, 2);
                p[3] += count(next, 3);
                p[5] += count(next, 5);
                p[7] += count(next, 7);
            }
        }

        int[] v = make(p);

        v[1] = n + 1;

        for (int i = 2; i < 10 && v[1] >= 0; i++) {
            v[1] -= v[i];
        }

        v[1] = Math.max(0, v[1]);

        return join(v);
    }
}