
import java.util.HashMap;
import java.util.Map;
class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        Map<String,Integer> myMap1 = new HashMap<>();
        for (String z : participant){
            myMap1.put(z,myMap1.getOrDefault(z,0)+1);
        }
        for (String b : completion) {
            if (myMap1.containsKey(b)) {
                if (myMap1.get(b) == 1) {
                    myMap1.remove(b);
                } else {
                    myMap1.put(b, myMap1.getOrDefault(b, 0) - 1);
                }

            }
        }
        for (String q : myMap1.keySet()){
            answer = q;
        }
        return answer;
    }
}