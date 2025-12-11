import javax.smartcardio.ATR;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;

class Solution {
    public int[] solution(int[] numbers) {
        int[] result =  new int[numbers.length*(numbers.length-1)/2];
        int index = 0;
        Arrays.sort(numbers);
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i+1; j < numbers.length; j++) {

                    result[index] = (numbers[i] + numbers[j]);
                    index++;


            }

        }
        Set<Integer> mySet = new HashSet<>();
        for (int a : result){
            mySet.add(a);
        }
        int[] answer = new int[mySet.size()];
        index = 0;
        for (int a : mySet) {
            answer[index] = a;
            index++;

        }
        Arrays.sort(answer);
        return answer;
    }
}