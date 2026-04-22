/* Structure of Doubly Linked List
class Node
{
    int data;
    Node next;
    Node prev;
}*/
class Solution {
    static Node deleteAllOccurOfX(Node head, int x) {
        // code here
         if(head==null || head.next==null) return null;
        
        
        Node dummy=new Node();
        dummy.next=head;
        if(head!=null) head.prev=null;
        Node curr=dummy;
        while(curr.next!=null){
            if(curr.next.data==x){
                curr.next=curr.next.next;
                if(curr.next!=null){
                    curr.next.prev=curr;
                }
            }else{
                curr=curr.next;
            }
        }
        
        
        head=dummy.next;
        if(head!=null) head.prev=null;
        return head;
    }
}