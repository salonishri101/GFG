/*
class Node{
    int data;
    Node next;

    Node(int x){
        data = x;
        next = null;
    }
}
*/

class Solution {
    
    
    public Node reverseList(Node head) {
        
Node prev=null,curr=head,nextNode=null;

while(curr!=null){
    nextNode=curr.next;
    curr.next=prev;
    prev=curr;
    curr=nextNode;
}


return prev;//prev is head now

    }
    
    
    
    public Node addOne(Node head) {
        
         head=reverseList(head);
         
         Node temp=head;
         int carry=1;
        
        // code here.
        
        
        while(temp!=null && carry>0){
            int sum=carry+temp.data;
            temp.data=sum%10;
            carry=sum/10;
            
            
            if(carry>0 && temp.next==null){
            temp.next=new Node(0);
            }
            
            temp=temp.next;
        }
        
        head=reverseList(head);
        return  head;
    }
}












