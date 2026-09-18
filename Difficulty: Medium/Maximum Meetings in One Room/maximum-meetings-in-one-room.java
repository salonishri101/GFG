class Solution {
    public ArrayList<Integer> maxMeetings(int[] s, int[] f) {
        // code here
        
        Integer idx[] = new  Integer[f.length];
      
        
        for(int i =0;i<idx.length;i++){
            idx[i]=i;
           
        }
        
        
        
        
        Arrays.sort(idx, (a, b) -> {
            if(f[a] != f[b]){
                return Integer.compare(f[a], f[b]);
            }
            return Integer.compare(a, b);
        });
        
        
        
        
        int lastfinish=-1;
        
        
       
        // Arrays.sort(f);
        // int meet=1;
        ArrayList<Integer> ans = new ArrayList<>();
        //  ArrayList<Integer> finish = new ArrayList<>();
        
        // //  ans.add(meet);
        //  finish.add(f[idx[0]]);
         
        
                
            int i =0;    
        while(i<idx.length){
            
            
            
            
            
            
            // if(s[i]>t[j-1])
            //  meet++;
            
            
            if( s[idx[i]]>lastfinish){
               
                ans.add(idx[i]+1);
                // finish.add(f[i]);
                lastfinish=f[idx[i]];
               
            }
            
            
            i++;
            
            
            
        }
        
        Collections.sort(ans);
        
        
        return ans;
        
        
    }
}