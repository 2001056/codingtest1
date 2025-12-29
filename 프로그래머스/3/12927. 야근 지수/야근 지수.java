import java.util.*;
class Solution {
    public long solution(int n, int[] works) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        long answer=0;
        int total = 0;
        for (int a : works){
            total +=a;
            pq.add(a);
        }
        if (n >= total) {
            return 0;
        }

            for (int i = 0; i < n; i++) {
                if (pq.isEmpty() || pq.peek() == 0) {
                    return 0;
                }else pq.add(pq.poll() - 1);
            }
            while(!pq.isEmpty()) {
                int a = pq.poll();
                answer += (long) a * a;

            }
        return answer;
    }
}