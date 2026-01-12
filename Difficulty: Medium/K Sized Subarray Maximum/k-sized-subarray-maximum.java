class Solution {
    public ArrayList<Integer> maxOfSubarrays(int[] arr, int k) {
        // code here
        
        Deque<Integer> dq = new LinkedList<>();
        ArrayList<Integer> l= new ArrayList<>();
        
       
      
       for(int i =0;i<arr.length;i++){
         
         //remove element that is out of window
         
         if(!dq.isEmpty() && dq.peekFirst()==i-k){
             dq.pollFirst();
         }
         //remove smaller el from back
         while(!dq.isEmpty() && arr[i]>arr[dq.peekLast()]){
              dq.pollLast();
         }
         //add curr idx
         dq.add(i);
         
         if(i>=k-1){
             l.add(arr[dq.peekFirst()]);
         }
        
        
       }
       return l; 
        
    }
}



// tc-nlogn
// sc-k
// class Solution {
//     public ArrayList<Integer> maxOfSubarrays(int[] arr, int k) {
//         // code here
        
//         PriorityQueue<Integer> pq = new PriorityQueue<>((a,b)->Integer.compare(b,a));
//         ArrayList<Integer> l= new ArrayList<>();
        
       
//       for(int i =0;i<k;i++){
//           pq.add(arr[i]);
//       }
//         int max= pq.peek();
//           l.add(max);
//       int i =0;
//       for(int j =k;j<arr.length;j++){
         
//           pq.remove(arr[i]);
//           i++;
//           pq.add(arr[j]);
//             max= pq.peek();
//           l.add(max);
          
          
//       }
       
        
//       return l; 
        
//     }
// }