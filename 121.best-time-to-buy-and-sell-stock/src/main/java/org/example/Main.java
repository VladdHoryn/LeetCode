package org.example;

public class Main {
    public static int maxProfit(int[] prices) {
        int l = 0, r = prices.length - 1, maxP, maxPL, maxPR;

        for(int i = 1; i < prices.length; ++i){
            maxP = -9999;
            maxPL = -1;
            maxPR = -1;
            if(prices[r] - prices[l] < prices[prices.length - 1 - i] - prices[i] && i <= prices.length - 1 - i){
                maxPL = i;
                maxPR = prices.length - 1 - i;
                maxP = prices[prices.length - 1 - i] - prices[i];
            }
            if(prices[r] - prices[l] < prices[prices.length - 1 - i] - prices[l] && l <= prices.length - 1 - i)
                if(maxP < prices[prices.length - 1 - i] - prices[l]){
                    maxPL = l;
                    maxPR = prices.length - 1 - i;
                    maxP = prices[prices.length - 1 - i] - prices[l];
                }

            if(prices[r] - prices[l] < prices[r] - prices[i] && i <= r)
                if(maxP < prices[r] - prices[i]){
                    maxPL = i;
                    maxPR = r;
                    maxP = prices[r] - prices[i];
                }

            if(maxP > prices[r] - prices[l]){
                l = maxPL;
                r = maxPR;
            }
        }

        if(prices[r] - prices[l] < 0)
            return 0;
        return (prices[r] - prices[l]);
    }

    public static void main(String[] args) {
        System.out.println(maxProfit(new int[]{2, 7, 1, 4}));
    }
}