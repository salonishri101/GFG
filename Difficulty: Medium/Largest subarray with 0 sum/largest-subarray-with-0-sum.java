

class Solution {
    int maxLength(int arr[]) {
        // code here
        
        
         
HashMap<Integer,Integer> m= new HashMap<>();
m.put(0,-1);
         int maxLen =0;
        int sum=0;
        for(int i =0;i<arr.length;i++){
         sum+=arr[i];
int val =sum;
// if(val==0){
//     count+=1;
    
// }

if(m.containsKey(val)){
  
    maxLen=Math.max(i-m.get(val),maxLen);
    
}else{


m.put(sum,i);
}

        }


// return maxLen==0?-1:maxLen;  
        
  return maxLen;       
        
    }
}





//only for +ve 

// class Solution {
//     int maxLength(int arr[]) {
//         // code here
        
        
     
// int len=0;
// int max=0;
// int currSum=0;

// int i=0,j=0;
// while( i<=j && j<arr.length){
// currSum+=arr[j];

// if(currSum==0){
//     len=j-i+1;
//     max=Math.max(len,max);
    
// }

// while( i<=j && currSum>0){
// currSum-=arr[i];
// i++;
// }

// j++;
// }


// return max;   
        
        
        
//     }
// }