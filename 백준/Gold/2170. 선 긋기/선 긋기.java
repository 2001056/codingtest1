import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int[][] line = new int[N][2];

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            line[i][0] = Integer.parseInt(st.nextToken());
            line[i][1] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(line, (a, b) -> {
            if (a[0] == b[0]) return a[1] - b[1];
            return a[0] - b[0];
        });

        int start = line[0][0];
        int end = line[0][1];
        long sum = 0;

        for (int i = 1; i < N; i++) {
            if (line[i][0] <= end) {
                end = Math.max(end, line[i][1]);
            } else {
                sum += end - start;
                start = line[i][0];
                end = line[i][1];
            }
        }

        sum += end - start;
        System.out.println(sum);
    }
}