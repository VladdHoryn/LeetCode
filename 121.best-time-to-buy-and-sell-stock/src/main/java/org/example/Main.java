package org.example;

public class Main {
    public static int maxProfit(int[] prices) {
        int l = 0, r = prices.length - 1;

        for(int i = 1; i < prices.length; ++i){
            if(prices[r] - prices[l] < prices[prices.length - 1 - i] - prices[i] && i <= prices.length - 1 - i){
                l = i;
                r = prices.length - 1 - i;
            }
            else if(prices[r] - prices[l] < prices[prices.length - 1 - i] - prices[l] && l <= prices.length - 1 - i)
                r = prices.length - 1 - i;
            else if(prices[r] - prices[l] < prices[r] - prices[i] && i <= r)
                l = i;
        }

        if(prices[r] - prices[l] < 0)
            return 0;
        return (prices[r] - prices[l]);
    }

    public static void main(String[] args) {
        System.out.println(maxProfit(new int[]{2 ,4 ,1}));
    }
}