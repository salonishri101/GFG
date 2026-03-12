class Solution {
    void pushZerosToEnd(int[] arr) {
        // code here
        int count =0;
        for(int i =0;i<arr.length;i++){
            if(arr[i]!=0 ){
                
                 arr[count] =arr[i];
                 count++;
            }
            
        }
        
        for(int i =count;i<arr.length;i++){
        
        arr[i]=0;
        }
    }
}



// ✅ Correct Flow
// - Traverse array → jitne non‑zero elements hain unko front mein copy karo.
// - count track karega ki next non‑zero kahan place karna hai.
// - Fill remaining positions → count ke baad ke saare elements ko 0 set kar do.
