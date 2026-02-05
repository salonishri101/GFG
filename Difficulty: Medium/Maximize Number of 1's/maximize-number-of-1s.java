class Solution {
    public int maxOnes(int arr[], int k) {
        // code here
        
        
        int l=0;
        
        int ZeroCount=0;
        int maxLen=0;
        for(int r =0;r<arr.length;r++){
           
               
               if(arr[r]==0){
                   ZeroCount++;
               
               }
             
                  while(ZeroCount>k){
                if(arr[l]==0){
                   ZeroCount--;
                }
               l++;
           }
           
               
           int len = r-l+1;
           maxLen =Math.max(len,maxLen);
           
        }
        
        return maxLen;
        
    }
}







  
//         int l=0;
//         int r=0;
//         int ZeroCount=0;
//         int maxLen=0;
//         while(r<arr.length){
//           if(ZeroCount<=k) {
               
//               if(arr[r]==0){
//                   ZeroCount++;
//               }
//               r++;
//           }else{
//                 if(arr[l]==0){
//                   ZeroCount--;
//               }
//               l++;
//           }
           
//           int len = r-l+1;
//           maxLen =Math.max(len,maxLen);
           
//         }
        
//         return maxLen;
        
        
        
//         Tumhara code flow dekho:

// if(valid)
//   r++
// else
//   l++

// length calculate


// 👉 Tum length har iteration me calculate kar rahi ho
// Chahe window valid ho ya invalid

// Ye main bug hai....so instead use while















// Iska matlab hai:

// 👉 Tum ek aisa subarray dhundo
// 👉 Jisme maximum k zero ho

// Bas.
// Yehi pura problem hai.









// ⭐ Sabse Pehle Problem Ko Rephrase Karo

// Question bol raha hai:

// 👉 At most k zero ko 1 bana sakte ho
// 👉 Longest consecutive 1s chahiye

// ⭐ Hidden Meaning (REAL IDEA)

// Iska matlab hai:

// 👉 Tum ek aisa subarray dhundo
// 👉 Jisme maximum k zero ho

// Bas.
// Yehi pura problem hai.

// ⭐ Why?

// Agar kisi window me:

// 0 count ≤ k


// To tum un sab zero ko flip karke pure window ko 1 bana sakti ho.

// Isliye hume 1 count nahi…
// 👉 zero count control karna hai.

// ⭐ Core Brain Click

// Hum actually solve kar rahe hain:

// 👉 Longest subarray with at most k bad elements

// Yaha bad element = 0

// ⭐ Ab Sliding Window Kyun?

// Socho brute force:

// Har subarray check karo → zero count karo
// 👉 O(n²)

// Too slow ❌

// ⭐ Smart Observation

// Agar current window valid hai
// → next element add karke try karo

// Agar invalid ho jaye
// → left se shrink karo

// Ye exactly sliding window ka use case hai.

// ⭐ Sliding Window Ka Philosophy

// 👉 Window ko jitna ho sake expand karo
// 👉 Jab rule break ho → minimum shrink karo

// Rule kya hai?

// zeroCount ≤ k

// ⭐ Ek Line Intuition

// 👉 "Maximum length window maintain karo jisme rule break na ho."

// ⭐ Real Life Analogy

// Socho tum ek movie hall me ho 🎬

// Rule:
// 👉 Maximum k noisy log allowed

// Tum seats fill kar rahi ho (right pointer)

// Jab noisy log zyada ho jaye
// 👉 starting wale log hata do (left pointer)

// Goal:
// 👉 longest row maintain karni hai

// ⭐ Sliding Window Recognition Trick (Very Important)

// Jab question me ye words aaye:

// longest / maximum subarray

// at most k changes

// at most k bad elements

// continuous segment