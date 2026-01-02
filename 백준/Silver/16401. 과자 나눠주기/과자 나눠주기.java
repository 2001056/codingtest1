    import java.util.*;

    public class Main {
        public static void main(String[] args) {
            Scanner sc= new Scanner(System.in);
            int M = sc.nextInt();
            int N = sc.nextInt();
            int[] arr = new int[N];
            int max = 0;
            for (int i = 0; i < N; i++) {
                arr[i] = sc.nextInt();
                max = Math.max(max,arr[i]);
            }
            int start = 1;
            int answer = 0;
            int end = max;
            while (start<=end){
                int mid = (start + end) /2 ;
                int count = 0;
                for (int x : arr) {
                    count += x / mid;
                }
                if (count >= M) {
                    answer = mid;
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }

            System.out.println(answer);
        }

    }

