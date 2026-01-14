class Solution {
   public static int catchThieves(char arr[],int k){

int p =0,t=0,count =0;
int n = arr.length;
while(p<n && arr[p]!='P'){//->find first police
    p++;
}

while(t<n && arr[t]!='T'){//->find first thief
    t++;
}

while(p<n && t<n){
    if(Math.abs(p-t)<=k){
        count++;
        p++;
        t++;

while(p<n && arr[p]!='P'){
    p++;
}

while(t<n && arr[t]!='T'){
    t++;
}


    }else if(p<t){//if police is too far from thief and behind the thief so move forwand
        p++;
       while(p<n && arr[p]!='P'){
    p++;
} 
    }else{
        t++;
       while(t<n && arr[t]!='T'){//if thief is too far from police and behind the police so move forward
    t++;
} 
    }
}

return count;

}
}