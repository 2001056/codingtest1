
import java.io.BufferedReader;
import java.io.IOException;

import java.io.InputStreamReader;
import java.util.*;

class Solution {
    public int solution(int[] scoville, int K) {
        Queue<Integer> pq = new PriorityQueue<>();
        int answer=0;
        for (int a : scoville){
            pq.add(a);

        }
        while (pq.peek() < K){
            if (pq.size()<2){
                    answer = -1;
                    break;
                    
                
            }
            int a = pq.poll();
            int b = pq.poll();
            answer += 1;
            int mixed = a+ b*2;
            pq.add(mixed);
            
        }
        return answer;
    }
}