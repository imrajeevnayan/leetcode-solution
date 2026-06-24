class Solution {

    int[][] dirs = {
        {-1,-1},{-1,0},{-1,1},
        {0,-1},        {0,1},
        {1,-1},{1,0},{1,1}
    };

    public int mostFrequentPrime(int[][] mat) {

        int m = mat.length;
        int n = mat[0].length;

        Map<Integer,Integer> freq = new HashMap<>();

        for(int i=0;i<m;i++) {

            for(int j=0;j<n;j++) {

                for(int[] d : dirs) {

                    int r = i;
                    int c = j;

                    int num = 0;

                    while(r >= 0 && r < m &&
                          c >= 0 && c < n) {

                        num = num * 10 + mat[r][c];

                        if(num > 10 && isPrime(num)) {
                            freq.put(
                                num,
                                freq.getOrDefault(num,0)+1
                            );
                        }

                        r += d[0];
                        c += d[1];
                    }
                }
            }
        }

        int ans = -1;
        int maxFreq = 0;

        for(Map.Entry<Integer,Integer> e : freq.entrySet()) {

            int prime = e.getKey();
            int f = e.getValue();

            if(f > maxFreq) {

                maxFreq = f;
                ans = prime;

            } else if(f == maxFreq && prime > ans) {

                ans = prime;
            }
        }

        return ans;
    }

    private boolean isPrime(int num) {

        if(num < 2) return false;

        for(int i=2;i*i<=num;i++) {

            if(num % i == 0)
                return false;
        }

        return true;
    }
}