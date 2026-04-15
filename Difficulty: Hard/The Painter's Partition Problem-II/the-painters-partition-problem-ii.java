class Solution {
    public int minTime(int[] arr, int k) {
        // code here
        
        
          int low=Arrays.stream(arr).max().getAsInt();
          int high=Arrays.stream(arr).sum();
        int ans=0;
         while(low<=high){
             int mid=low+(high-low)/2;
                
                
                
                int painters=1,time=0;
             for(int i =0;i<arr.length;i++){
                 
              if(arr[i]+time<=mid){
                 time+= arr[i];
                 
              }else{
                   painters++;
                  time=arr[i];
              }
             }


             if(painters<=k){
                ans=mid;
                high=mid-1;
             }else{
                  low=mid+1;
             }
         }
        
        return ans;
        
        
    }
}
