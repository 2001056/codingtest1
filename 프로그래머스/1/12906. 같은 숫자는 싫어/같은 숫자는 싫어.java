
import java.io.BufferedReader;
import java.io.IOException;

import java.io.InputStreamReader;
import java.util.*;


public class Solution {
    public int[] solution(int []arr) {
        Stack<Integer> st = new Stack<>();
       for (int a : arr){
           if (st.isEmpty() || st.peek() != a){
               st.push(a);
           }
       }
        int[] answer = new int[st.size()];
        for (int i = answer.length - 1; i >= 0; i--) {
            answer[i] = st.pop();
        }
       

        return answer;
    }
}