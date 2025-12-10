import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Solution {
    public String solution(String my_string, String letter) {
        String answer ="";
        for (char ch : my_string.toCharArray()) {
            if (ch!= letter.charAt(0)){
                answer+=ch;
            }
        }
        return answer;
    }
}