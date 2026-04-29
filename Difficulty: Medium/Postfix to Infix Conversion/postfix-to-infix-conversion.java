// User function Template for Java

class Solution {
    static String postToInfix(String exp) {
        // code here
        
        
        Stack<String> s = new Stack<>();
        
        
    for(int i =0;i<exp.length();i++){
    char ch =exp.charAt(i);
    
    if(Character.isLetterOrDigit(ch)){
    s.push(Character.toString(ch));
   }else {
       String op2=s.pop();
       String op1=s.pop(); 
       String temp="("+op1+ch+op2+")";
       s.push(temp);
   } 
        
   }
   return s.pop();
   
    }
}
