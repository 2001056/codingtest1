
import java.io.BufferedReader;
import java.io.IOException;

import java.io.InputStreamReader;
import java.util.*;


public class Main {
    public static void main(String[] args) throws IOException {
        LinkedList<Integer> ln1 = new LinkedList<>();
        LinkedList<Integer> ln2 = new LinkedList<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int index = 0 ;
        for (int i = 1; i <= N; i++) {
            ln1.add(i);

        }
        while (!ln1.isEmpty()) {
            index = (index + k -1 ) % ln1.size();

            ln2.add(ln1.get(index));
            ln1.remove(index);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("<");

        for (int i = 0; i < ln2.size(); i++) {
            sb.append(ln2.get(i));
            if (i != ln2.size() - 1) {
                sb.append(", ");
            }
        }

        sb.append(">");
        System.out.println(sb.toString());
        }




    }








