class Solution {
    public int sumSubMins(int[] arr) {
        // code here
        
        
        Stack<Integer> s1 = new Stack<>();
        Stack<Integer> s2 = new Stack<>();
        
        
        int pse[]= new int[arr.length];
        int nse[]= new int[arr.length];
        
        
        for(int i =0;i<arr.length;i++){
            
            while(!s1.isEmpty() && arr[s1.peek()]>=arr[i]){
                s1.pop();
            }
            
            if(s1.isEmpty()){
                pse[i]=i+1;
            }else{
                pse[i]=i-s1.peek();
            }
            
            s1.push(i);
        }
        
        
        
                for(int i =arr.length-1;i>=0;i--){
            
            while(!s2.isEmpty() && arr[s2.peek()]>arr[i]){
                s2.pop();
            }
            
            if(s2.isEmpty()){
                nse[i]=arr.length-i;
            }else{
                nse[i]=s2.peek()-i;
            }
            
            
            s2.push(i);
        }
        
        
        //  for(int i =0;i<arr.length/2;i++){
        //   int temp=nse[i];
        //   nse[i]=nse[arr.length-1-i];
        //   nse[arr.length-1-i]=temp;
        // }
        
        
    //   int l[]= new int[arr.length];
    //     int r[]= new int[arr.length];
        
    //     for(int i =0;i<arr.length;i++){
    //         l[i]=i-pse[i];
    //         r[i]=nse[i]-i;
    //     }
        
        
        
        int mod = (int)1e9 + 7;

        
        long sum =0;
        for(int i =0;i<arr.length;i++){
             sum = (sum + (long)arr[i] * pse[i] * nse[i]) % mod;

        }
        
        
        return (int)sum;
        
        
    }
}
