// User function Template for Java

class Solution {
    public int rowWithMax1s(int arr[][]) {
        // code here
        int rowIdx=-1;
        int i =0,j =arr[0].length-1;
        while(i<arr.length && j>=0){
            if(arr[i][j]==1){
                rowIdx=i;
                j--;
            }else{
                i++;
            }
        }
        
       return rowIdx; 
        
    }
}