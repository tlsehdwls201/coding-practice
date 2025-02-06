import java.util.*;
import java.io.*;


public class Main {
    static int dx[] = {1, 0, -1, 0};
    static int dy[] = {0, 1, 0, -1};
    static int A[][];
    static boolean visited[][];
    static int N, M;
    public static void main(String[] args) throws IOException {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter w = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(r.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        A = new int[N+1][M+1];
        visited = new boolean[N+1][M+1];

        for(int i = 1; i <= N; i++) {
            String str[] = r.readLine().split("");
            for(int j = 1; j <= M; j++) {
                A[i][j] = Integer.parseInt(str[j-1]);
            }
        }

        BFS(1,1);
        w.write(A[N][M] + "\n");




        w.flush();
        w.close();
        r.close();
    }

    private static void BFS(int i, int j) {
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{i, j});
        visited[i][j] = true;
        while(!queue.isEmpty()) {
            int dot[] = queue.poll();
            for(int k = 0; k < 4; k++) {
                int x = dot[0] + dx[k]; // depth, 즉 깊이를 구하는 식으로 N,M까지 이 방식으로 도출된 값이 최단거리이다.
                int y = dot[1] + dy[k];
                if(x >= 1 && y >= 1 && x <= N && y <= M) {
                    if(A[x][y] != 0 && !visited[x][y]) {
                        A[x][y] = A[dot[0]][dot[1]] + 1;
                        queue.add(new int[]{x, y});
                        visited[x][y] = true;
                    }
                }
            }
        }
    }
}