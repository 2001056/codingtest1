import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());
        String[] cases = new String[t];
        
        for (int i = 0; i < t; i++) {
            cases[i] = br.readLine();
        }
        
        int[] results = new int[t];

       
        for (int i = 0; i < t; i++) {
            char[] arr = cases[i].toCharArray();
            int count = 0;
            int sum = 0;

            for (char c : arr) {
                if (c == 'O') {
                    count++;
                    sum += count;
                } else {
                    count = 0;
                }
            }

            results[i] = sum;
        }
        for (int i = 0; i < t; i++) {
            System.out.println(results[i]);
        }
    }
}
