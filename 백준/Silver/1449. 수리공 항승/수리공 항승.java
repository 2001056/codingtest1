import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int N = Integer.parseInt(st.nextToken());
        int L = Integer.parseInt(st.nextToken());
        
        int[] arr = new int[N];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        
        Arrays.sort(arr);
        
        int count = 0;
        int coverEnd = 0;
        
        for (int i = 0; i < N; i++) {
            if (arr[i] > coverEnd) {
                count++;
                coverEnd = arr[i] + L - 1;
            }
        }
        
        System.out.println(count);
    }
}
