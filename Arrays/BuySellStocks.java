import java.util.*;

public class BuySellStocks {
 public static int stocks(int prices[]) {
  int n = prices.length;
  int buyPrice = Integer.MAX_VALUE; // +infinity
  int maxProfit = 0; // track maximum profit

  for (int i = 0; i < n; i++) {
   if (buyPrice < prices[i]) {
    int profit = prices[i] - buyPrice; // today's profit
    maxProfit = Math.max(maxProfit, profit);
   }
    else {
    buyPrice = prices[i];
   }
  }
  return maxProfit;
 }
 public static void main(String[] args) {
  int prices[] = { 7, 1, 5, 3, 6, 4 };
  System.out.println("MAximum profit of the stock is : " + stocks(prices));
 }
}
