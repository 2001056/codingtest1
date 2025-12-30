import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static List<List<Integer>> adjList = new ArrayList<>();
    static boolean[] visited;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] inputs = br.readLine().split(" ");
        int N = Integer.parseInt(inputs[0]);
        int M = Integer.parseInt(inputs[1]);

        for (int i = 0; i <= N; i++) {
            adjList.add(new ArrayList<>());
        }

        for (int i = 0; i < M; i++) {
            String[] temp = br.readLine().split(" ");
            int start = Integer.parseInt(temp[0]);
            int end = Integer.parseInt(temp[1]);
            adjList.get(start).add(end);
            adjList.get(end).add(start);
        }

        visited = new boolean[N + 1];
        int count = 0;

        for (int i = 1; i <= N; i++) {
            if (!visited[i]) {
                dfs(i);
                count++;
            }
        }

        System.out.println(count);
    }

    static void dfs(int start) {
        visited[start] = true;
        for (int target : adjList.get(start)) {
            if (!visited[target]) {
                dfs(target);
            }
        }
    }
}
