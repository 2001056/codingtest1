
import java.io.BufferedReader;
import java.io.IOException;

import java.io.InputStreamReader;
import java.util.*;


public class Main {
    public static void main(String[] args) throws IOException {
        LinkedList<Integer> ln = new LinkedList<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        for (int i = 1; i < N+1; i++) {
            ln.add(i);

        }
        while (ln.size()!=1) {
            ln.remove();
            ln.add(ln.poll());

        }
        System.out.println(ln.peek());



    }






    }

