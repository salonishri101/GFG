class Solution {
    
    Stack<Character> curr = new Stack<>();
    Stack<Character> history = new Stack<>();
    
    
    public void append(char x) {
        // append x into document
        curr.push(x);
        history.clear();
    }

    public void undo() {
        // undo last change
       char i= curr.pop();
       history.push(i);
    }

    public void redo() {
        // redo changes
        char j =history.pop();
        curr.push(j);
    }

    public String read() {
        // read the document
        StringBuilder ans = new StringBuilder();
        for(char ch:curr){
            ans.append(ch);
        }
        
        return ans.toString();
    }
}
