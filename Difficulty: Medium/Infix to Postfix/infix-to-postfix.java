class Solution {
    
    
       
       public static int pre(char ch){
           if(ch=='^') return 3;
           if(ch=='/' || ch=='*') return 2;
           if(ch=='+'|| ch=='-') return 1;
           
           return -1;
       }
       
    
    
    public static String infixToPostfix(String s) {
        // code here
        
     
               
 Stack<Character> stk = new Stack<>();
 
 StringBuilder result=new StringBuilder();
for(int i =0;i<s.length();i++){
    char ch =s.charAt(i);
    
    if(Character.isLetterOrDigit(ch)){
    result.append(ch);
   }else if(ch=='('){
        stk.push(ch);
    }else if(ch==')'){
        while(!stk.isEmpty() && stk.peek()!='('){
            result.append(stk.pop());
        }
        stk.pop();
    }else{//operator
        while(!stk.isEmpty() && 
          ((pre(ch) < pre(stk.peek())) || 
           (pre(ch) == pre(stk.peek()) && ch != '^'))) {
        result.append(stk.pop());
    }
        stk.push(ch);
    }
    
    
}

 while(!stk.isEmpty()){
           result.append(stk.pop());  
        }

return result.toString();
    
    }
}