class Solution {
    public long subarrayXor(int arr[], int k) {
        // code here
        
        
        HashMap<Integer,Integer> map = new HashMap<>();
        
        int xor=0;
        int count=0;
        
        for(int i =0;i<arr.length;i++){
           
           xor^=arr[i];
           
           
           if(xor==k) count++;
           
           
           if(map.containsKey(xor^k)){
              
               count+=map.get(xor^k);
               
           }
           
           map.put(xor, map.getOrDefault(xor, 0) + 1);
            
        }
        
        
return count;
    }
}