class Solution {
    public int minMen(int arr[]) {

        int n = arr.length;
        List<int[]> intervals = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            if (arr[i] == -1) continue;

            int start = Math.max(0, i - arr[i]);
            int end   = Math.min(n - 1, i + arr[i]);
            intervals.add(new int[]{start, end});
        }

        intervals.sort((a, b) -> a[0] - b[0]);

        int curr = 0;
        int i = 0;
        int count = 0;

        while (curr <= n - 1) {
            int farthest = -1;   // IMPORTANT change

            while (i < intervals.size() && intervals.get(i)[0] <= curr) {
                farthest = Math.max(farthest, intervals.get(i)[1]);
                i++;
            }

            // ❌ no interval covered current time
            if (farthest == -1) return -1;

            count++;
            curr = farthest + 1;
        }

        return count;
    }
}
