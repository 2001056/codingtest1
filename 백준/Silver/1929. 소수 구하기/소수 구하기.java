import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int m = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());

        boolean[] isComposite = new boolean[n + 1];
        isComposite[0] = true;
        if (n >= 1) isComposite[1] = true;

        int limit = (int) Math.sqrt(n);
        for (int i = 2; i <= limit; i++) {
            if (!isComposite[i]) {
                for (int j = i * i; j <= n; j += i) {
                    isComposite[j] = true;
                }
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int i = Math.max(m, 2); i <= n; i++) {
            if (!isComposite[i]) sb.append(i).append('\n');
        }

        System.out.print(sb.toString());
    }
}
