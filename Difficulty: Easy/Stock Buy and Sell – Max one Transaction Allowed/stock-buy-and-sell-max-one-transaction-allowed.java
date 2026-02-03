class Solution {
    
  
    
    public int maxProfit(int[] prices) {
        // Code here
        

        
        
        
    int minBuyingPrice=prices[0];
    int maxProfit=Integer.MIN_VALUE;
    int profit =0;
        for(int i =1;i<prices.length;i++){
            
            
            profit=prices[i]-minBuyingPrice;
            maxProfit=Math.max(profit,maxProfit);
            
            if(minBuyingPrice>prices[i]){
                minBuyingPrice=prices[i];
            }
        }
        
        return maxProfit<0?0:maxProfit;
    }
}