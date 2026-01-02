
import java.io.BufferedReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

//정렬이 필요한 경우
//start<end의 조건
//start가 0부터 시작, end가 length-1부터 시작
public class Main {
//    두수의 합 : 백준
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = Integer.parseInt(sc.nextLine());
    int[] arr = new int[N];
    for (int i = 0; i < N; i++) {
        arr[i] = sc.nextInt();

    }
    sc.nextLine();
    int M = Integer.parseInt(sc.nextLine());

    Arrays.sort(arr);
    int start = 0;
    int end = arr.length-1;
    int count = 0;
    while (start<end){
        int sum = arr[start] + arr[end];
        if (sum==M){
            count++;
            start++;
        } else if (sum < M) {
            start++;

        } else if (sum > M) {
            end--;
        }

    }
    System.out.println(count);
}
}
