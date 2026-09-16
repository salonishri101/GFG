class Solution {
    public double fractionalKnapsack(int[] val, int[] wt, int capacity) {
        // code here
        int n =val.length;
    Integer idx[]= new Integer[n];
    
    for(int i =0;i<n;i++){
        idx[i]=i;
    }
    
    Arrays.sort(idx,(a,b)->Double.compare((double)val[b]/wt[b],(double)val[a]/wt[a]));
    
    double ans =0;
    
    for(int i:idx){
        if(wt[i]<=capacity){
        ans+=val[i];
        capacity-=wt[i];
    }else{
        ans+=((double)val[i]/wt[i]*capacity);
        break;
    }
           
           
       }
        
        
        
        return ans;
    }
}