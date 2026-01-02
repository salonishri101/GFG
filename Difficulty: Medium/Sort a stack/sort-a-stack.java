class Solution {
    public void sortStack(Stack<Integer> st) {
        // code here
        Stack <Integer> helper = new Stack<>();
        
        while(!st.isEmpty()){
             int temp=st.pop();
    
            while(!helper.isEmpty() && temp>helper.peek() ){
                 st.push(helper.pop());
                           }
            
                    helper.push(temp);
        }
            
            
            
            
            
                while(!helper.isEmpty()){
             
       st.push(helper.pop());
                              
                               }
            
            
        
    }
}






// Main stack se ek element nikalo → temp

// Helper stack ke top se compare karo

// Agar temp bada hai → helper ka element wapas main me bhejo

// Phir temp helper me daal do

// Last me helper se sab wapas main stack me daalo