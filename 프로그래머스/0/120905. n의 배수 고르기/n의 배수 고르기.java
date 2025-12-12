import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public int[] solution(int n, int[] numlist) {
        int[] answer = new int[numlist.length];
        int index = 0;
        for (int a : numlist) {
            if (a % n == 0) {
                answer[index] = a;
                index ++;
            }
        }
        return Arrays.copyOf(answer, index);
    }
}