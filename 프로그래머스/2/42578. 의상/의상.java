import java.util.HashMap;
import java.util.Map;

class Solution {
    public int solution(String[][] clothes) {
        Map<String,Integer> myMap = new HashMap<>();
        int result = 1;
        int answer =0;
        for (int i = 0; i < clothes.length; i++) {
                String type = clothes[i][1];
                myMap.put(type, myMap.getOrDefault(type,0)+1);

            


            }
        for (int a : myMap.values()) {
            result *= a+1;
        }

            answer = result-1;
        return answer;
        }
        
    }
