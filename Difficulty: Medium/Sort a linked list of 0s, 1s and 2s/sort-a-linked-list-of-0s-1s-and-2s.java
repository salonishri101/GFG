/*
class Node {
    int data;
    Node next;

    Node(int d)
    {
        data = d;
        next = null;
    }
}*/

class Solution {
    public Node segregate(Node head) {
        // code here
        
      int[] count=new int[3];
      
      
      Node temp =head;
      
      while(temp!=null){
          count[temp.data]++;
          temp=temp.next;
      }
      
      
      temp=head;
      
      for(int i =0;i<3;i++){
          while(count[i]-->0){
          temp.data=i;
          temp=temp=temp.next;
      }
      }
      return head;
        
        
    }
}