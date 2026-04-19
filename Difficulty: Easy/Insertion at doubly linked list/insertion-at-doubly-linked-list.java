/*
class Node
{
    int data;
    Node next;
    Node prev;
    Node(int data)
    {
        this.data = data;
        next = prev = null;
    }
}
*/


class Solution {
    Node insertAtPos(Node head, int p, int x) {
       
        Node newNode = new Node(x);

        // If list is empty
        if (head == null) return newNode;

        Node temp = head;
        int count = 0;

        // Traverse to p-th node
        while (temp != null && count < p) {
            temp = temp.next;
            count++;
        }

        // If p is out of bounds, just return head
        if (temp == null) return head;

        // Case 1: Insert at the end (temp.next == null)
        if (temp.next == null) {
            temp.next = newNode;
            newNode.prev = temp;
            return head;
        }

        // Case 2: Insert in the middle
        newNode.next = temp.next;
        newNode.prev = temp;
        temp.next.prev = newNode;
        temp.next = newNode;

        return head;
    }
}