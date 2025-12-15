
import java.io.BufferedReader;
import java.io.IOException;

import java.io.InputStreamReader;
import java.util.*;


public class Main {
    public static void main(String[] args) throws IOException {
       Stack<Character> characterStack = new Stack<>();
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       int l = 1;
       while(l!=0){
           String input = br.readLine();
           if (input.equals("0")) break;
           Stack<Integer> stack = new Stack<>();
           for (char c : input.toCharArray()) {
               stack.push(c - '0');
           }
           int[] arr = new int[stack.size()];
           for (int i = 0; i < stack.size(); i++) {
               arr[i] = stack.get(i);
           }
           int[] arr1 = new int[arr.length];
           for (int i = 0; i < arr.length; i++) {
               arr1[i] = stack.pop();
               
           }
           if (Arrays.equals(arr,arr1)){
               System.out.println("yes");
           }
           else {
               System.out.println("no");
           }
       }
    }
    }








