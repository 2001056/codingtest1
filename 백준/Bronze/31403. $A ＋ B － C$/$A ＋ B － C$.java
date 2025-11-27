import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String a1 = br.readLine();
        String b1 = br.readLine();
        String c1 = br.readLine();
        int a = Integer.parseInt(a1);
        int b = Integer.parseInt(b1);
        int c = Integer.parseInt(c1);
        System.out.println(a + b - c);
        int result = Integer.parseInt(a1 + b1) - Integer.parseInt(c1);
        System.out.println(result);
    }
}
