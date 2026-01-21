class Solution {
    public ArrayList<Integer> calculateSpan(int[] arr) {
        int n = arr.length;
        ArrayList<Integer> result = new ArrayList<>();
        Stack<Integer> st = new Stack<>();  // stores indices

        for (int i = 0; i < n; i++) {
            // Pop while current price >= price at stack top
            while (!st.isEmpty() && arr[st.peek()] <= arr[i]) {
                st.pop();
            }

            // If stack empty → span = i+1, else span = i - st.peek()
            int span = st.isEmpty() ? (i + 1) : (i - st.peek());
            result.add(span);

            // Push current index
            st.push(i);
        }
        return result;
    }
}
