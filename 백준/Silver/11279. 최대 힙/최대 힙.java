
import java.io.BufferedReader;
import java.io.IOException;

import java.io.InputStreamReader;
import java.util.*;


public class Main {
    public static void main(String[] args) throws IOException {
        Queue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        for (int i = 0; i < N; i++) {
            int z = Integer.parseInt(br.readLine());
            if (z==0){
                if (pq.isEmpty()){
                    System.out.println(0);
                }else {
                    System.out.println(pq.poll());
                }
            }else{
                pq.add(z);

            }
        }

    }

    }

