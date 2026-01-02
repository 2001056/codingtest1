class Solution {
    public int[] solution(int[] sequence, int k) {
        int n = sequence.length;

        int l = 0, r = 0;
        int sum = 0;

        int minLen = Integer.MAX_VALUE;
        int start = 0, end = 0;

        while (true) {
            if (sum >= k) {
                if (sum == k) {
                    int len = r - l;
                    if (len < minLen) {
                        minLen = len;
                        start = l;
                        end = r - 1;
                    }
                }
                sum -= sequence[l++];
            } else {
                if (r == n) break;
                sum += sequence[r++];
            }
        }

        return new int[]{start, end};
    }
}