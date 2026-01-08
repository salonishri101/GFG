class Solution {
    
    public int AtMostK(int[] arr, int k){
        
        
        int i=0;
        int oddCount=0;
        int ans =0;
        for(int j =0;j<arr.length;j++){
            
            if(arr[j]%2!=0){
                oddCount++;
            }
            
            while(oddCount>k){
               if(arr[i]%2!=0){
              oddCount--;
              }
        
              i++;
            }
                    
         ans+=(j-i+1);
         
        }
        
       return ans; 
        
    }
    
    
    
    public int countSubarrays(int[] arr, int k) {
        // code here
        
        return AtMostK(arr,k)-AtMostK(arr,k-1);
        

    }
}
