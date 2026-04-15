class Solution {
    public int findPages(int[] arr, int k) {
        // code here
    
     // If students are more than books, allocation is impossible
        if (k > arr.length) return -1;
    
    
          int low=Arrays.stream(arr).max().getAsInt();
          int high=Arrays.stream(arr).sum();
        int ans=0;
         while(low<=high){
             int mid=low+(high-low)/2;
                
                
                
                int students=1,pages=0;
             for(int i =0;i<arr.length;i++){
                 
              if(arr[i]+pages<=mid){
                 pages+= arr[i];
                 
              }else{
                   students++;
                  pages=arr[i];
              }
             }


             if(students<=k){
                ans=mid;
                high=mid-1;
             }else{
                  low=mid+1;
             }
         }
        
        return ans;
        
        
    }
}