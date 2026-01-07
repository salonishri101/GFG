class Solution {
    ArrayList<Integer> countDistinct(int arr[], int k) {
        // code here
        HashMap<Integer,Integer> map=new HashMap<>();
         ArrayList<Integer> ans = new ArrayList<>();
        
        for(int i =0;i<k;i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        
        int i =0;
        int j =k;
        
        ans.add(map.size());
        
        
        while(j<arr.length){
       
        
        if(map.get(arr[i])==1){
            map.remove(arr[i]);
        }else{
            map.put(arr[i],map.get(arr[i])-1);
        }
        
        //map.put(arr[i],map.getOrDefault(arr[i],0)-1);
        
        map.put(arr[j],map.getOrDefault(arr[j],0)+1);
        ans.add(map.size());
        i++;j++;
        }
       
       return ans;
        
    }
}