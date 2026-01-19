class Solution {
    public String removeKdig(String s, int k) {
        
        Deque<Character> dq= new LinkedList<>();
        
        for(int i =0;i<s.length();i++){
            
            
            
            char curr = s.charAt(i);
            
            while( k>0 && !dq.isEmpty() && curr<dq.peekLast()){
                dq.pollLast();
                k--;
            }
            dq.addLast(curr);
            
            
            
        }
        
          while (k > 0 && !dq.isEmpty()) {
            dq.pollLast();
            k--;
        }

        StringBuilder ans=new StringBuilder();
        
      
      for( char ch:dq){  
       ans.append(ch);
      }
      
      while(ans.length()>0 && ans.charAt(0)=='0'){
          ans.deleteCharAt(0);
      }
        
        
        // code here
        
        
        return ans.length()==0?"0":ans.toString();
    }
}