/*

Definition for singly Link List Node
class Node
{
    int data;
    Node next,prev;

    Node(int x){
        data = x;
        next = null;
        prev = null;
    }
}

You can also use the following for printing the link list.
Node.printList(Node node);
*/

class Solution {
    public static ArrayList<ArrayList<Integer>> findPairsWithGivenSum(int target,
                                                                      Node head) {
        // code here
        
       
        ArrayList<ArrayList<Integer>> ans=new ArrayList<>();
         if(head==null || head.next==null) return ans;
        Node start=head,end=head;
        
        while(end.next!=null){
            end=end.next;
        }
        
        while(start!=null && end!=null && start!=end && start.prev!=end){
            int sum=start.data+end.data;
            if(sum==target){
               ArrayList<Integer> list=new ArrayList<>();
               list.add(start.data);
               list.add(end.data);
               ans.add(list);
                start = start.next;
                end = end.prev;
            }else if(sum>target){
                end=end.prev;
            }else{
                start=start.next;
            }
        }
        
       return ans; 
        
    }
}
