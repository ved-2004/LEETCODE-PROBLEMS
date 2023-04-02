/*
We have two variables, one storing the day with the least price - the day we buy, and the other traversing the array
At each iteration, we first update the minBuy variable, and then update profit.

This Solution - time beats 82%, mem beats 16%
Divide and Conquer Approach uploaded as well.
 */
public class BestTimeBuySellSingleLoop {
    public int maxProfit(int[] prices) {
        int profit = 0, minBuy = Integer.MAX_VALUE;
        for(int i=0;i<prices.length;i++)
        {
            minBuy = Math.min(minBuy,prices[i]);
            profit = Math.max(profit,prices[i] - minBuy);
        }
        return profit;
    }
}
