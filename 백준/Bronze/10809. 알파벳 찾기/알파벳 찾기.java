import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine();

        int[] pos = new int[26];

        for (int i = 0; i < 26; i++) {
            pos[i] = -1;
        }

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            int idx = c - 'a';

            if (pos[idx] == -1) {
                pos[idx] = i;
            }
        }

        for (int i = 0; i < 26; i++) {
            System.out.print(pos[i] + " ");
        }
    }
}
