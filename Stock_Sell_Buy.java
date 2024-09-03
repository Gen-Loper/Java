package Java_C;

public class Stock_Sell_Buy {
        public static int buyAndSellStocks(int prices[]) {
            int buyPrices = Integer.MAX_VALUE;
            int maxProfit = 0;
            for(int i=0; i<prices.length; i++){
                if(buyPrices < prices[i]) {
                    int profit = prices[i] -buyPrices; // today's profit
                    maxProfit = Math.max(maxProfit,profit);
                } else {
                    buyPrices = prices[i];
                }
            }
            return maxProfit;
        }
    
        public static void main(String args[]){
            int prices[] = {7,1,5,2,6,4};
            System.out.println(buyAndSellStocks(prices));
        }
    }
    
