import java.util.*;
import java.io.*;


public class Main {
    static ArrayList<Integer> A[];
    static boolean visited[];
    public static void main(String[] args) throws IOException {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter w = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(r.readLine());
        int M = Integer.parseInt(r.readLine());
        visited = new boolean[N + 1]; // N + 1인 이유 -> 배열의 0번째 인덱스 사용 안함
        A = new ArrayList[N + 1]; // 위와 동일

        for(int i = 1; i <= N; i++) {
            A[i] = new ArrayList<Integer>();
        }

        for(int i = 0; i < M; i++) {
            StringTokenizer st = new StringTokenizer(r.readLine());
            int s = Integer.parseInt(st.nextToken());
            int e = Integer.parseInt(st.nextToken());
            A[s].add(e); // 방향성이 없는 노드이기에 s번째 배열 리스트 공간에 e값을 가지는 노드를 삽입
            A[e].add(s);
        }

        //int count = 0; // dfs의 횟수를 저장하는 변수
        DFS(1);

        int cnt = 0;
        for(int i = 2; i <= N; i++) {
            if(visited[i])
                cnt++;
        }

        w.write(cnt + "\n");

        w.flush();
        w.close();
        r.close();
    }

    private static void DFS(int i) {
        if(visited[i])
            return;

        visited[i] = true; // 방문했으니 이제 true로 전환

        for(int idx : A[i]) { // 노드의 인접 노드들을 추출, 확장된 for문 사용!
            if(!visited[idx]) {
                DFS(idx); // 재귀함수
            }
        }
    }

}
