
import java.util.Scanner;

//이분탐색 문제는 이분탐색의 대상으로 삼을지 고민
public class Main {
//    예산 : 백준
public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    int N = Integer.parseInt(sc.nextLine());
    int[] arr = new int[N];
    for (int i = 0; i < N; i++) {
        arr[i] = sc.nextInt();
    }
    sc.nextLine();
    int M = sc.nextInt();
    int start = 0;
    int max = 0;
    int answer = -1;
    for (int x : arr) {
        if (x > max) {
            max = x;
        }
    }
    int end = max;
    while (start<=end){
        int mid = (start + end) /2 ;

        int sum = 0;
        for (int x : arr) {
            sum += Math.min(x, mid);
        }

        if (sum <= M) {
            answer = mid;
            start = mid + 1;
        } else {
            end = mid - 1;
        }
    }


    System.out.println(answer);
    }

}

