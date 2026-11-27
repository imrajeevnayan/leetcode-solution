class Solution {
    public int maximumSaleItems(int[][] items, int budget) {
        int n = items.length;
        int[] f = new int[budget + 1];
        int minPrice = Integer.MAX_VALUE;

        for (int[] item : items) {
            int factor = item[0];
            int price = item[1];
            minPrice = Math.min(minPrice, price);

            // Count how many items we get for free (including itself) when buying this item
            int cnt = 0;
            for (int[] jItem : items) {
                if (jItem[0] % factor == 0) {
                    cnt++;
                }
            }

            // 0-1 Knapsack style: buying the first copy of this item
            for (int j = budget; j >= price; j--) {
                f[j] = Math.max(f[j], f[j - price] + cnt);
            }
        }

        // After buying some "first copies", use remaining budget to buy as many cheapest items as possible
        int ans = 0;
        for (int i = 0; i <= budget; i++) {
            if (f[i] > 0 || i == 0) {
                int extra = (budget - i) / minPrice;
                ans = Math.max(ans, f[i] + extra);
            }
        }

        return ans;
    }
}