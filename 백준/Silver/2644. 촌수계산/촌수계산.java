import java.util.*;

public class Main {
    static List<List<Integer>> adjList;
    static boolean[] visited;
    static int[] dist;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();      
        int A = sc.nextInt();     
        int B = sc.nextInt();      
        int M = sc.nextInt();      

        adjList = new ArrayList<>();
        for (int i = 0; i <= N; i++) {
            adjList.add(new ArrayList<>());
        }

        for (int i = 0; i < M; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            adjList.get(x).add(y);
            adjList.get(y).add(x);
        }

        visited = new boolean[N + 1];
        dist = new int[N + 1];

        bfs(A);

        if (visited[B]) {
            System.out.println(dist[B]);
        } else {
            System.out.println(-1);
        }
    }

    static void bfs(int start) {
        Queue<Integer> q = new LinkedList<>();
        q.add(start);
        visited[start] = true;
        dist[start] = 0;

        while (!q.isEmpty()) {
            int now = q.poll();

            for (int next : adjList.get(now)) {
                if (!visited[next]) {
                    visited[next] = true;
                    dist[next] = dist[now] + 1;
                    q.add(next);
                }
            }
        }
    }
}
