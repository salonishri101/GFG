class Solution {
    public int minCandy(int arr[]) {
        // code here
         int ans[]=new int[arr.length];
Arrays.fill(ans,1);
  for (int i = 1; i < arr.length; i++) {
	if(arr[i]>arr[i-1]){
	ans[i] = ans[i-1] + 1;
	}
	  
  }

 for (int i = arr.length-2; i >=0; i--) {
	if(arr[i]>arr[i+1]){
	   ans[i] = Math.max(ans[i], ans[i + 1] + 1);
	}
	  
  }
int total=0;
   for (int i = 0; i < ans.length; i++) {
	total+=ans[i];
	  
  }


	return total;
    }
}
