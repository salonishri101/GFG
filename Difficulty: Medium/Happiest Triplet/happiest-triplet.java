class Solution {
    int[] smallestDiff(int a[], int b[], int c[]) {
        // write code here
        
       Arrays.sort(a); 
       Arrays.sort(b); 
       Arrays.sort(c);
       
       int ans[]=new int[3];
       
       int i =0,j =0,k =0;
       int minDiff=Integer.MAX_VALUE;
       int minSum=Integer.MAX_VALUE;
       while(i<a.length&& j<b.length&& k<c.length){
           
        int diff=Math.max(Math.max(a[i],b[j]),c[k])-Math.min(Math.min(a[i],b[j]),c[k]);
        int sum= a[i]+b[j]+c[k];
        
        
        
        
       if(diff<minDiff || (diff==minDiff && sum<minSum)) {
           minDiff=diff;
           minSum=sum;
           ans=new int[]{a[i],b[j],c[k]};
       }
       
       
       
       
       
       
       
       
       
       
       int minVal=Math.min(Math.min(a[i],b[j]),c[k]);
       if(minVal==a[i])i++;
       else if(minVal==b[j])j++;
       else k++;
       
       
        
       }
       
       Arrays.sort(ans);
       return new int[]{ans[2],ans[1],ans[0]};
       
    }
}











// ⭐ Algorithm Shape (High Level)
// Sort all three arrays

// i = 0, j = 0, k = 0

// While teeno pointers valid:

//     current triplet check karo

//     max-min difference nikaalo

//     best answer update karo

//     jis array ka element minimum hai
//     uska pointer aage badhao