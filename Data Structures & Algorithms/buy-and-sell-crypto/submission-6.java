class Solution {
    public int maxProfit(int[] prices) {
        if (prices.length == 1) {
            return 0;
        }

        int l = 0;
        int r = 1;

        int max = 0;

        while (r < prices.length) {
            int profit = prices[r] - prices[l];
            max = Math.max(max, profit);

            if (prices[r] < prices[l]) {
                l++;
            } else {
                r++;
            }
        }

        return max;
    }
}
