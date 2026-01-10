



class Solution {
   public int knapSack(int val[], int wt[], int capacity) {
        
        int dp[][]= new int[val.length+1][capacity+1];
        
        
        for(int i =0;i<dp.length;i++){//first col
            dp[i][0]=0;
        }
        
        for(int j =0;j<dp[0].length;j++){//first row
            dp[0][j]=0;
        }
       
       
       
       for(int i =1;i<dp.length;i++){
           for(int j =1;j<dp[0].length;j++){
             
             //valid
             if(wt[i-1]<=j){
                 //include
                 int ans1= val[i-1]+dp[i][j-wt[i-1]];
                 
                 //exclude
                  int ans2= dp[i-1][j];
                  
                  dp[i][j]=Math.max(ans1,ans2);
                 
             }else{
                dp[i][j]=dp[i-1][j]; 
             }
             
           }
       }
      return dp[val.length][capacity];  
    }
}
