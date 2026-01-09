class Solution {
    public int countAtMostK(int arr[], int k) {
        
        HashMap<Integer,Integer> map=new HashMap<>();
        // code here
        int i =0;
        int ans=0;
        for(int j =0;j<arr.length;j++){
            
          
            
            map.put(arr[j],map.getOrDefault(arr[j],0)+1);
            
              while(map.size()>k){
                  
                 
                  map.put(arr[i],map.getOrDefault(arr[i],0)-1); 
                
                  
                  
                  
                if(map.get(arr[i])==0){
                    map.remove(arr[i]);
                }
                i++;
            }
            
           ans+=(j-i+1); 
            
        }
        
        return ans;
    }
}
