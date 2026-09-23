class Solution {
    static int solve(int bt[]) {
        // code here
        
        
        
          Arrays.sort(bt);
        
        int total =0;
        int currtime=0;
        
        
        
        
        for(int i =0;i<bt.length;i++){
             
            total+=currtime;
            currtime+=bt[i];
                  }
        
        
        return total/bt.length;
        
        
        
        
        
        
    }
}



// 3 -> 0
// 6 -> 3
// 7 -> 3+6 = 9
// 8 -> 3+6+7 = 16
