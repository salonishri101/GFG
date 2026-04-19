// User function Template for Java

/*
class Node
{
    int data;
    Node next, prev;
    Node(int data)
    {
        this.data = data;
        this.next = this.prev = null;
    }
}
*/

// Complete the function
class Solution {
    public static Node deleteHead(Node head) {
        // your code here
        
        
        
        // head.next.prev=null;
        // head=head.next;
        
        
        
         
        head=head.next;
        if(head!=null){
            head.prev=null;
        }
        
        return head;
    }
}