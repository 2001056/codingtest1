
import java.io.BufferedReader;
import java.io.IOException;

import java.io.InputStreamReader;
import java.util.*;


class Solution {
    boolean solution(String s) {
        Stack<Character> myStack = new Stack<>();

       boolean answer =true;
        for (char a : s.toCharArray()) {
            if (a == ('(')){
                myStack.push(a);
            }
            else {
                if (myStack.isEmpty()) return false;
                myStack.pop();
            }

        }
        if (myStack.isEmpty()){
            answer = true;
        }
        else {
            answer = false;
        }

        return answer;
    }
}