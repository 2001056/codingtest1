import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int L = Integer.parseInt(br.readLine());
        String str = br.readLine();

        long M = 1234567891;
        long r = 31;
        long pow = 1; 
        long hash = 0;

        for (int i = 0; i < L; i++) {
            int value = str.charAt(i) - 'a' + 1;  
            hash = (hash + value * pow) % M;   
            pow = (pow * r) % M;                
        }

        System.out.println(hash);
    }
}
