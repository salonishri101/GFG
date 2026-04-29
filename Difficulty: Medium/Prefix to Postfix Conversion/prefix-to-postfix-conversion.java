// User function Template for Java

class Solution {
    static String preToPost(String pre_exp) {
        // code here
         Stack<String> s = new Stack<>();
        
        
    for(int i =pre_exp.length()-1;i>=0;i--){
    char ch =pre_exp.charAt(i);
    
    if(Character.isLetterOrDigit(ch)){
     s.push(Character.toString(ch));
   }else {
       String op1=s.pop();
       String op2=s.pop(); 
       String temp=op1+op2+ch;
       s.push(temp);
   } 
        
   }
   return s.peek();
    }
}
