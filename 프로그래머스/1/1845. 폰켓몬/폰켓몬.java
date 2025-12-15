
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        Set<Integer> mySet = new TreeSet<>();
        for (int a : nums){
            mySet.add(a);
        }
        if (mySet.size() < nums.length/2){
            answer = mySet.size();
        }else {
            answer = nums.length/2;
        }
        
        return answer;
    }
}