/*
class Node {
    int data;  // dataue stored in node
    Node next;
    Node prev;

    Node(int dataue) {
        data = dataue;
        next = null;
        prev = null;
    }
}
*/
class Solution {
    Node removeDuplicates(Node head) {
        // code here
        
        if(head==null || head.next==null) return head;
        
        Node curr=head;
        while(curr.next!=null && curr.next != null){
            if(curr.data==curr.next.data){
                curr.next=curr.next.next;
                if(curr.next!=null){
                    curr.next.prev=curr;
                }
            }else{
                curr=curr.next;
            }
        }
        
        return head;
    }
}