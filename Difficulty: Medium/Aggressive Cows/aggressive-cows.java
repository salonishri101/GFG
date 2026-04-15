class Solution {
    public int aggressiveCows(int[] stalls, int k) {
        // code here
        
         int low=1,high=Arrays.stream(stalls).max().getAsInt()-Arrays.stream(stalls).min().getAsInt();
        int ans=0;
         while(low<=high){
             int mid=low+(high-low)/2;
                
                
                Arrays.sort(stalls);
                int cows=1,lastStallpos=stalls[0];
             for(int i =0;i<stalls.length;i++){
              if(stalls[i]-lastStallpos>=mid){
                  cows++;
                  lastStallpos=stalls[i];
              }
             }


             if(cows>=k){
                ans=mid;
                low=mid+1;
                
             }else{
                high=mid-1;
             }
         }


return ans;
        
    }
}