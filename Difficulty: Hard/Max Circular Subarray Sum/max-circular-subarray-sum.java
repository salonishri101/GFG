class Solution {
    public int maxCircularSum(int arr[]) {
        // code here
            
            
            int maxSubArraySum=Integer.MIN_VALUE;
            int minSubArraySum=Integer.MAX_VALUE;
            int currSum =0;
            int totalSum=0;
        for(int i =0;i<arr.length;i++){
            totalSum+=arr[i];
            currSum+=arr[i];
            
            maxSubArraySum=Math.max(maxSubArraySum,currSum);
            if(currSum<0){
                currSum=0;
            }
        }
        
        
         currSum =0;
        for(int i =0;i<arr.length;i++){
            
            currSum+=arr[i];
            
           
            minSubArraySum=Math.min(minSubArraySum,currSum);
            if(currSum>0){
                currSum=0;
            }
        }
        
        
        if (maxSubArraySum < 0) {
    return maxSubArraySum;
}

        
        int circularArraySum= totalSum-minSubArraySum;
        
        return Math.max(maxSubArraySum,circularArraySum);
        
    }
}
