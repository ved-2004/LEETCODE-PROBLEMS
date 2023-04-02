import java.util.*;
public class BestTimeBuySellUsingDNC {
    public int combine(int[] arr1, int[] arr2) {
        int min = Integer.MAX_VALUE,max = Integer.MIN_VALUE;
        for(int i=0;i<arr1.length;i++)
        {
            min = Math.min(arr1[i],min);
        }
        for(int i=0;i<arr2.length;i++)
        {
            max = Math.max(arr2[i],max);
        }
        return max-min;
    }
    public int maxProfit(int[] prices) {
        int n = prices.length;
        if(n==1)
            return 0;
        else if(n==2)
            return Math.max(0,prices[n-1] - prices[n-2]);
        int[] sub1 = Arrays.copyOfRange(prices,0,n/2);
        int[] sub2 = Arrays.copyOfRange(prices,n/2,n);
        int profit1 = maxProfit(sub1);
        int profit2 = maxProfit(sub2);
        int profit = combine(sub1,sub2);
        return Math.max(profit, Math.max(profit1,profit2));
    }
}
