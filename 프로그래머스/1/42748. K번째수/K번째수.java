import javax.smartcardio.ATR;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        for (int i = 0; i < commands.length; i++) {
                int start = commands[i][0]-1;
                int end = commands[i][1];
                int[] arr = Arrays.copyOfRange(array,start,end);
                Arrays.sort(arr);
                int z = commands[i][2]-1;
                answer[i] = arr[z];

            }


        return answer;
 
    }
}