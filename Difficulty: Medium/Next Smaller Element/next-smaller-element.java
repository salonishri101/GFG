class Solution {
    static ArrayList<Integer> nextSmallerEle(int[] arr) {
        // code here
        
        
        Stack<Integer> s= new Stack<>();
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i =arr.length-1;i>=0;i--){
            while(!s.isEmpty() && arr[i]<=s.peek()){
                s.pop();
            }
            
            if(s.isEmpty()){
                ans.add(-1);
            }else{
                ans.add(s.peek());   
                }
          //ans[i]=s.isEmpty()?-1:s.peek();
          
          s.push(arr[i]);
            
        }
            
            
            Collections.reverse(ans);
            return ans;
        
    }
}