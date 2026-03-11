class Solution {
    static ArrayList<Integer> preGreaterEle(int[] arr) {
        // code here
        
        
                ArrayList<Integer> ans = new ArrayList<>();
        Stack<Integer> s = new Stack<>();
        for(int i =0;i<arr.length;i++){
            
            while(!s.isEmpty() && s.peek()<=arr[i]){
                s.pop();
            }
            
            if(s.isEmpty()){
                ans.add(-1);
            }else{
                ans.add(s.peek());
            }
           
           
           s.push(arr[i]) ;
        }
        
        
        // Collections.reverse(ans);
        return ans;
        
    }
}