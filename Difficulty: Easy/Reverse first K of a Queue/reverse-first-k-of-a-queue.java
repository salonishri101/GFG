class Solution {
    public Queue<Integer> reverseFirstK(Queue<Integer> q, int k) {
        // code here
          int size=q.size();
        
        if(k>size){
            return q;
        }
        
        
        Stack<Integer> s= new Stack<>();
        int i=1;
        while(i<=k){
           // q.remove();
            s.push(q.remove());
            i++;
        }
        
        while(!s.isEmpty()){
           // s.pop();
            q.add(s.pop());
        }
        int j =1;
        
        while(j<=size-k){
            // q.remove();
              q.add(q.remove());
              j++;
        }
        
        
       return q; 
    }
}