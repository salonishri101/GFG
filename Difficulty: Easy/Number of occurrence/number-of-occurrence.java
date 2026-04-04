class Solution {
    int countFreq(int[] arr, int target) {
        // code here
        
 int i =0,j=arr.length-1;
    int fOcur=-1,lOcur=-1;

while(i<=j){
    int mid=i+(j-i)/2;
if(arr[mid]==target){
    fOcur=mid;
     j=mid-1;
}else if(arr[mid]>target){
  j=mid-1;
}else{
    i=mid+1;
}
}

i =0;j=arr.length-1;
while(i<=j){
    int mid=i+(j-i)/2;
if(arr[mid]==target){
    lOcur=mid;
     i=mid+1;
}else if(arr[mid]>target){
  j=mid-1;
}else{
    i=mid+1;
}
}

if (fOcur == -1) return 0;
int ans=lOcur-fOcur+1;

return ans; 
        
    }
}
