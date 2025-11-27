import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine()); // 숫자 개수
        String s = br.readLine(); // 공백 없이 붙은 숫자들

        int sum = 0;

        for (int i = 0; i < n; i++) {
            sum += s.charAt(i) - '0'; // 문자를 숫자로 변환
        }

        System.out.println(sum);
    }
}
