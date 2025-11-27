import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        while (T-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int R = Integer.parseInt(st.nextToken());
            String S = st.nextToken();

            for (int i = 0; i < S.length(); i++) {
                char ch = S.charAt(i);
                for (int r = 0; r < R; r++) {
                    sb.append(ch);
                }
            }
            sb.append("\n");
        }

        System.out.print(sb);
    }
}
