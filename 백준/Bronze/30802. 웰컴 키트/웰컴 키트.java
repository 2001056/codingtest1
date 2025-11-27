import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        long N = Long.parseLong(br.readLine());

        String[] sizes = br.readLine().split(" ");
        long S = Long.parseLong(sizes[0]);
        long M = Long.parseLong(sizes[1]);
        long L = Long.parseLong(sizes[2]);
        long XL = Long.parseLong(sizes[3]);
        long XXL = Long.parseLong(sizes[4]);
        long XXXL = Long.parseLong(sizes[5]);

        String[] tp = br.readLine().split(" ");
        long T = Long.parseLong(tp[0]);
        long P = Long.parseLong(tp[1]);

        // 티셔츠 묶음 계산
        long totalBundles = 0;
        long[] arr = {S, M, L, XL, XXL, XXXL};

        for (long x : arr) {
            totalBundles += (x + T - 1) / T;
        }

        long penBundle = N / P;
        long penSingle = N % P;

        System.out.println(totalBundles);
        System.out.println(penBundle + " " + penSingle);
    }
}
