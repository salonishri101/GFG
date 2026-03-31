

class Solution {
    ArrayList<Integer> findTwoElement(int arr[]) {
        // code here
    int n = arr.length;    
int mis=-1,rpt=-1;
long actsum=0;
       for(int i =0;i<arr.length;i++){
         actsum+=arr[i];
       }
        
        long actsqrsum =0;
        for(int i =0;i<arr.length;i++){
         actsqrsum+=((long)arr[i]*arr[i]);
        }
        
        long sum =(long)n*(n+1)/2;
        long sqrsum =(long)n*(n+1)*(2*n+1)/6;
    
    
    
    long diff1=sum-actsum;
    long diff2=sqrsum-actsqrsum;
    
    
    mis=(int)(((diff2/diff1)+diff1)/2);
    rpt=(int)(mis-diff1);
        
        ArrayList<Integer> ans =new ArrayList<>();
        
        ans.add(rpt);
        ans.add(mis);
        
        return ans;
    }
}











// class Solution {
//     ArrayList<Integer> findTwoElement(int arr[]) {
//         // code here
        
//       HashMap<Integer,Integer> map = new HashMap<>();
//       int repeat=-1,missing=-1;
//       for(int i =0;i<arr.length;i++){
//           if(map.containsKey(arr[i])){
//               repeat=arr[i];
//             //   break;
//           }else{
//               map.put(arr[i],1);
//           }
           
//       }
        
        
//         for(int i =1;i<=arr.length;i++){
//             if(!map.containsKey(i)){
//                 missing=i;
//             }
//         }
        
//         ArrayList<Integer> ans =new ArrayList<>();
//         ans.add(repeat);
//         ans.add(missing);
        
        
//         return ans;
//     }
// }
