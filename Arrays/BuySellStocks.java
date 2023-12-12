public class BuySellStocks {

    public static int BuyAndSellStocks(int prices[]) {
        int buyPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        // Min of buying and Max of selling
        for (int i = 0; i < prices.length; i++) {
            if (buyPrice < prices[i]) { //profit
                int profit = prices[i] - buyPrice; // todays profit
                maxProfit = Math.max(maxProfit, profit);
            } else {
                buyPrice = prices[i]; // 
            }
        }

        return maxProfit;
    }
    
    public static void main(String[] args) {
        int prices[] = {7, 1, 5, 3, 6, 4};
        System.out.println(BuyAndSellStocks(prices));
    }
}
