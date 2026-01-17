class Solution {
    public static boolean checkRedundancy(String s) {
        // code here
        
        


Stack<Character> st = new Stack<>();
for (int i = 0; i <s.length(); i++) {
    char ch = s.charAt(i);
    int count =0;
    if(ch==')'){
      while (st.peek()!='(') { 
         st.pop() ;
         count++;
      }
      st.pop();

      if(count<=1){
        return true;
      }
    }else{
        st.push(ch);
    }
}
return false;


        
        
        
        
        
    }
}
