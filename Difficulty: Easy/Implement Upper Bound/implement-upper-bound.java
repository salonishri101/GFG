class Solution {
    int upperBound(int[] arr, int target) {
        // code here
        
        
             int i =0,j = arr.length-1;
       int ans=arr.length;

     while(i<=j){
        int mid=i+(j-i)/2;
       
       if(arr[mid]>target){
          ans=mid;
          
         j=mid-1;
       }else if(arr[mid]<=target){
         i=mid+1;
           
       }
     }
     
     
     return ans;
        
        
        
    }
}
