class Solution {
    
    
     public int AtMostK(String s, int k) {
         
              
      int arr[]= new int[26];
      
      int i =0;
      int distCount=0;
      int ans = 0;
      for(int j =0;j<s.length();j++){
            char ch = s.charAt(j);
            int idx=ch-'a';
            if(arr[idx]==0){
              distCount++;  
            }
            
            arr[idx]+=1;
            
            while(distCount>k){
                 arr[s.charAt(i)-'a']-=1;
                 
                if(arr[s.charAt(i)-'a']==0){
                    distCount--;
                }
               
                i++;
                
            }
            
         ans+=(j-i+1);  
      }
       
      return ans; 
         
     }
    
    public int countSubstr(String s, int k) {
        //  code here
       
   return AtMostK(s,k)-AtMostK(s,k-1);
    }
}