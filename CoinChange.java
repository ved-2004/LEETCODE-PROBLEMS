public class CoinChange {
    public int coinChange(int[] coins, int amount) {
        int n = coins.length;
        int inf = Integer.MAX_VALUE;
        int dp[] = new int[amount+1];
        dp[0] = 0;
        for(int i=1;i<=amount;i++) {
            dp[i] = inf;
        }
        for(int i=1;i<=amount;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(coins[j] <= i)
                {
                    int prev = dp[i - coins[j]];
                    if(prev!=inf && prev + 1 < dp[i])
                        dp[i] = prev + 1;
                }
            }
        }
        return dp[amount] == inf ? -1 : dp[amount];
    }
}
