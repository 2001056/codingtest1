import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int T = Integer.parseInt(st.nextToken());

        int[][] arr = new int[N + 1][2];

        for (int i = 1; i <= N; i++) {
            st = new StringTokenizer(br.readLine());
            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());
        }

        int[] dp = new int[T + 1];

        for (int i = 1; i <= N; i++) {
            int time = arr[i][0];
            int score = arr[i][1];

            for (int t = T; t >= time; t--) {
                dp[t] = Math.max(dp[t], dp[t - time] + score);
            }
        }

        System.out.println(dp[T]);
    }
}
