import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        int a = Integer.parseInt(input);
        for (int b = 1; b <= a; b++) {
            for (int c = 0; c < a - b ; c++) {
                System.out.print(" ");
            }
            for (int s = 0; s < b; s++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}