class Solution {
    public void rearrangeQueue(Queue<Integer> q) {
        // code here
        
        Queue<Integer> q1= new LinkedList<>();
        Queue<Integer> q2= new LinkedList<>();
        
        
        int count= (q.size())/2;
        int temp =1;
        while(temp<=count){
                q1.add(q.remove());
                temp++;
        }
        
        
        while(!q.isEmpty()){
           q2.add(q.remove()); 
        }
        
        
       
        
        while(!q1.isEmpty() && !q2.isEmpty()){
              q.add(q1.remove());
             q.add(q2.remove());  
        }
        
        while(!q1.isEmpty()) q.add(q1.remove());
while(!q2.isEmpty()) q.add(q2.remove());

        
        
        
        
    }
}
