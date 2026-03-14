// User function Template for Java

class Solution {
    public int longestSubarray(int[] arr, int k) {
        // code here
        
  
  int ps[]=new int[arr.length];
  ps[0]=arr[0];
  for(int i =1;i<arr.length;i++){
      ps[i]=ps[i-1]+arr[i];
  }
  
  HashMap<Integer,Integer> m= new HashMap<>();
  
  int len =0;
  int maxLen =0;
  //int count=0;
  for(int j =0;j<arr.length;j++){
      
      if(ps[j]==k) {
          len = j+1;
          maxLen=Math.max(len,maxLen);
          //count++;
      }
      
      int val=ps[j]-k;
      
      if(m.containsKey(val)){
          //int freq=map.put(val,map.getOrDefault(val,0)+1);
          //count+=freq;
          
          int i =m.get(val);
          len = j-i;
          maxLen=Math.max(len,maxLen);
      }
      
      m.putIfAbsent(ps[j],j);
      
      
  }
  
  
  return maxLen;
  
   
    }
}




//for non negative array

// / User function Template for Java

// class Solution {
//     public int longestSubarray(int[] arr, int k) {
//         // code here
        
//         int i =0,j =0;
//         int len =0;
//         int maxLen=0;
//         int sum =0;
//         while(j<arr.length){
//             sum+=arr[j];
            
            
            
            
//             while(sum>k){
//                 sum-=arr[i];
//                 i++;
//             }
            
//             if(sum==k){
//                 len =j-i+1;
//             }
            
//             maxLen =Math.max(len,maxLen);
//             j++;
//         }
        
//       return maxLen;  
//     }
// }
