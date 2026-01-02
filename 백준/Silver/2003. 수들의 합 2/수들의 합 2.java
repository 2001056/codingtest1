

import java.util.Scanner;

//정렬을 하면안되는 경우
public class Main {
//    수들의 합 2
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int K = sc.nextInt();
    int[] arr = new int[N];
    for (int i = 0; i < arr.length; i++) {
        arr[i] = sc.nextInt();
    }
    int a = 0;
    int sum = 0;
    int count = 0;
    int l = 0;
    int r =0;
    while (true) {
        if (sum >= K) {
            if (sum == K) count++;
            sum -= arr[l++];
        } else {
            if (r == N) break;
            sum += arr[r++];
        }
    }
    System.out.println(count);

}
}
