
import java.io.BufferedReader;
import java.io.IOException;

import java.io.InputStreamReader;
import java.util.*;


public class Main {
    public static void main(String[] args) throws IOException {
        Map<String, Integer> myMap = new TreeMap<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        List<String> myList = new ArrayList<>(N);
        for (int i = 0; i < N; i++) {
            String fileName = br.readLine();
            String[] parts = fileName.split("\\.");
            String ext = parts[parts.length - 1];
            myMap.put(ext, myMap.getOrDefault(ext, 0) + 1);
        }

        StringBuilder sb = new StringBuilder();
        for (String a : myMap.keySet()) {
            sb.append(a).append(" ").append(myMap.get(a)).append("\n");
        }
        System.out.print(sb.toString());


    }






    }

