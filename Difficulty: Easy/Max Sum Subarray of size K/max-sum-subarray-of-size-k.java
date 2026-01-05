class Solution {
    public int maxSubarraySum(int[] arr, int k) {
        // Code here
        
        int maxSum=Integer.MIN_VALUE;
        int windowSum=0;
        for(int i =0;i<k;i++){
            windowSum+=arr[i];
        }
        maxSum=windowSum;
        int i =0;
        for(int j=k;j<arr.length;j++){
            windowSum=windowSum+arr[j]-arr[i];
            maxSum=Math.max(windowSum,maxSum);
            i++;
        }
        return maxSum;
        
    }
}