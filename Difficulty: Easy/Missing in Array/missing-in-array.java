class Solution {
    int missingNum(int arr[]) {
        // code here
        
        
        
        int totalxor=0;
        int missxor=0;
       for(int i =0;i<arr.length;i++) {
          
          missxor=arr[i]^missxor;
       }
       
       
        for(int i =1;i<=arr.length+1;i++) {
          totalxor=i^totalxor;
          
       }
        
        
      return totalxor^missxor;  
        
    }
}