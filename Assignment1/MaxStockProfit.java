import java.io.*;
import java.util.*;
 
class StockProfit {
 
    public static int maxProfit(int[] prices)
    {
        int n = prices.length;
        int cost = 0;
        int maxCost = 0;
 
        if (n == 0) {
            return 0;
        }
 
        int min_price = prices[0];
 
        for (int i = 0; i < n; i++) {
 
            min_price = Math.min(min_price, prices[i]);
            cost = prices[i] - min_price;
 
            maxCost = Math.max(maxCost, cost);
        }
        return maxCost;
    }

    public static void main(String[] args)
    {
        int prices[] = { 7, 1, 5, 3, 6, 4 };
        System.out.print(maxProfit(prices));
    }
}