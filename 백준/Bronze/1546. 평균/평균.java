import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        String[] tokens = br.readLine().split(" ");
        double[] arr = new double[n];
        double max = Double.NEGATIVE_INFINITY;

        for (int i = 0; i < n; i++) {
            arr[i] = Double.parseDouble(tokens[i]);
            if (arr[i] > max) max = arr[i];
        }

        double sum = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = arr[i] / max * 100;
            sum += arr[i];
        }

        System.out.println(sum / n);
    }
}
