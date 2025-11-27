import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        int a = 0;
        int i;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int z = Integer.parseInt(st.nextToken()); // 입력 개수
        int x = Integer.parseInt(st.nextToken()); // 기준값

        int[] arr = new int[z];
        int idx = 0;

        // ⬇️ 여기 한 줄 읽어서 z개 숫자 처리하도록 변경 (핵심)
        StringTokenizer st1 = new StringTokenizer(br.readLine());

        for (i = 0; i < z; i++) {
            int c1 = Integer.parseInt(st1.nextToken());

            if (c1 < x) {
                arr[idx] = c1;
                idx++;
            }
        }

        for (i = 0; i < idx; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
