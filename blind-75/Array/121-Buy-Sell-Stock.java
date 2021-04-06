class Solution {
    public int maxProfit(int[] prices) {
        if(prices.length <=1 ) return 0;
       
        int buy = prices[0];
        int maxProfit = 0;

        for(int i = 0; i < prices.length; i++){
            int todayProfit = prices[i] - buy;
            maxProfit = Math.max(maxProfit, todayProfit);
            buy = Math.min(buy,prices[i]);
        }
        
        if(maxProfit <= 0) return 0;
        
        return maxProfit;
    }
}


  