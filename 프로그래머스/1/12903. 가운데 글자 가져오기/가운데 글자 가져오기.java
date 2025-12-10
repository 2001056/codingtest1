import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Solution {
    public String solution(String s) {
        String answer = "";
        Integer z = s.length() / 2;
        if (s.length()%2==0){
            answer += s.substring(z-1,z+1);
            }
        else {
            answer += s.substring(z,z+1);
        }
        return answer;
        
    }
}