class Solution {
    public int maxProfit(int[] prices) {

        int maxProfit = 0;
        int min = 0;
        for (int i=0; i<prices.length; i++) {
            int profit = prices[i] - prices[min];
            if (profit > maxProfit) {
                maxProfit = profit;
            }
            if (profit < 0) {
                min = i;
            }
        }
        return maxProfit;
    }
}