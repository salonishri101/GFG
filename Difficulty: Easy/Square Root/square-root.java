class Solution {
    int floorSqrt(int n) {
        // code here
        
       int i = 1,j =n;
       int ans=0;
       while(i<=j){
           int mid=i+(j-i)/2;
           
           if (mid * mid == n) {
                return mid; // perfect square
            } else if (mid * mid < n) {
                ans = mid;   // valid candidate
                i = mid + 1; // try bigger
            } else {
                j = mid - 1; // too large
            }
        }

        return ans;
    }
    
    
}


