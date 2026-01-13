class Solution {
    public boolean canServe(int[] arr) {
        // code here
        
        
        int five=0;
	int ten=0;
	for(int i =0;i<arr.length;i++){
	  if(arr[i]==5){
	      five++;
	        }else if(arr[i]==10){
	            if(five==0){
	                return false;
	            }else{
	                five--;
	                ten++;
	            }
	        }else { // coin == 20
    if (ten >= 1 && five >= 1) {
        ten--;
        five--;
    } else if (five >= 3) {
        five -= 3;
    } else {
        return false;
    }
}
	}
	return true;
        
    }
}



