class Solution {
    
    
    
    
     static int merge(int arr[],int st,int mid,int end){
        int temp[]=new int[end-st+1];
        
        int i =st;
        int j =mid+1;
        int k =0;
        int count=0;
        while(i<=mid && j<=end){
        if(arr[i]>arr[j]){
            temp[k++]=arr[j++];
            count+=(mid-i+1);
           
        }else{
           temp[k++]=arr[i++]; 
       
        }
        
        }
        
        while(i<=mid){
            temp[k++]=arr[i];
            i++;
        }
        
        
        
                while(j<=end){
            temp[k++]=arr[j];
            j++;
        }
        
        
        
        
          for (int p = 0; p < temp.length; p++) {
            arr[st + p] = temp[p];
        }

        return count;
        
    }
    
    
    
    
     static int sort(int arr[],int st,int end){
        int count=0;
       
        
if (st < end) {
            int mid = st + (end - st) / 2;
            count += sort(arr, st, mid);
            count += sort(arr, mid + 1, end);
            count += merge(arr, st, mid, end);
        }
        return count;
        
    }
    
    
    
    static int inversionCount(int arr[]) {
        // Code Here
       
        return sort(arr,0,arr.length-1);
        
    }
}