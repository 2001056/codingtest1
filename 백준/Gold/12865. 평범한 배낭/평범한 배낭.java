import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        int[][] arr = new int[N + 1][2];

        for (int i = 1; i <= N; i++) {
            st = new StringTokenizer(br.readLine());
            arr[i][0] = Integer.parseInt(st.nextToken()); 
            arr[i][1] = Integer.parseInt(st.nextToken()); 
        }

        int[] dp = new int[K + 1];

        for (int i = 1; i <= N; i++) {
            int weight = arr[i][0];
            int value = arr[i][1];

            for (int w = K; w >= weight; w--) {
                dp[w] = Math.max(dp[w], dp[w - weight] + value);
            }
        }

        System.out.println(dp[K]);
    }
}
