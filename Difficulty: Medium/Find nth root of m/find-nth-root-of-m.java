class Solution {
    public int nthRoot(int n, int m) {
        // code here
        
        
         if (m == 0) return 0;   // nth root of 0 is 0
        if (m == 1) return 1;   // nth root of 1 is 1
        int low=1,high=m;
        
        while(low<=high){
            int mid=low+(high-low)/2;
            
            int midpown=1;
            for(int i =0;i<n;i++){
                midpown*=mid;
                if(midpown>m) break;
            }
            
            
            if(midpown==m){
                return mid;
            }else if(midpown<m){
                low=mid+1;
            }else{
                high=mid-1;
            }
            
        }
        
        
        return -1;
    }
}