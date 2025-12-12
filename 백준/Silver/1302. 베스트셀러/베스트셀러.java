
import java.io.IOException;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String[] arr = new String[n];
        Map<String, Integer> myMap = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextLine();

        }

        for (int i = 0; i < arr.length; i++) {
            myMap.put(arr[i], myMap.getOrDefault(arr[i], 0) + 1);

        }

        String maxKey = "";

        int max = Integer.MIN_VALUE;
        for (String a : myMap.keySet()) {
            int value = myMap.get(a);
            if (max < value) {
                max = value;
                maxKey = a;

            }
            else if (max == value) {
                if(a.compareTo(maxKey) < 0) {
                    maxKey = a;
                }
            }
        }

        System.out.println(maxKey);

    }






    }

