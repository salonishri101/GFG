// User function Template for Java

class Solution {
    static String postToPre(String post_exp) {
        // code here
          Stack<String> s = new Stack<>();
        
        
    for(int i =0;i<post_exp.length();i++){
    char ch =post_exp.charAt(i);
    
    if(Character.isLetterOrDigit(ch)){
  s.push(Character.toString(ch));
   }else {
       String op2=s.pop();
       String op1=s.pop(); 
       String temp=ch+op1+op2;
       s.push(temp);
   } 
        
   }
   return s.pop();
    }
}
