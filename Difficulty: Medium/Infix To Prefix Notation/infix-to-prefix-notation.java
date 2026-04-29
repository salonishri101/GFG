class Solution {
    
     
        public int pre(char ch){
           if(ch=='^') return 3;
           if(ch=='/' || ch=='*') return 2;
           if(ch=='+'|| ch=='-') return 1;
           
           return -1;
       }
       
    
    
    public String infixToPrefix(String s) {
        // code here
       
        StringBuilder sb=new StringBuilder(s);
        sb.reverse();
        s=sb.toString();
        //swap characters
        
       
       char arr[]=s.toCharArray();
       for(int i =0;i<arr.length;i++){
           if(arr[i]=='(') {
               arr[i]=')';
           }else if(arr[i]==')') {
               arr[i]='(';
           }
       }
       
      
       s = new String(arr);
       
      
               
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
                   if(!stk.isEmpty()) stk.pop();
    }else{//operator
       while(!stk.isEmpty() && 
      ((pre(ch) < pre(stk.peek())) || 
       (pre(ch) == pre(stk.peek()) && ch == '^'))) {
    result.append(stk.pop());
}
        stk.push(ch);
    }
    
    
}

 while(!stk.isEmpty()){
           result.append(stk.pop());  
        }

result.reverse();
return result.toString();
    
       
       
        
    }
}