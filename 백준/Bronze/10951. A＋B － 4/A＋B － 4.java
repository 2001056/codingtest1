import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] arr = new int[10000];
        int idx = 0;

        StringTokenizer st = new StringTokenizer(br.readLine());

        while (st.hasMoreTokens()) {

            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            arr[idx] = a + b;
            idx++;

            if (!st.hasMoreTokens()) {
                String line = br.readLine();
                if (line == null || line.isEmpty()) break;
                st = new StringTokenizer(line);
            }
        }

        int i = 0;
        while (i < idx) {
            System.out.println(arr[i]);
            i++;
        }
    }
}
