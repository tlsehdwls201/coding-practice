import java.util.*;
import java.io.*;


public class Main {
    static ArrayList<Integer> A[];
    static boolean visited[];
    public static void main(String[] args) throws IOException {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter w = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(r.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        A = new ArrayList[N + 1];
        visited = new boolean[N + 1];
        for(int i = 1; i <= N; i++) {
            A[i] = new ArrayList<Integer>();
        }

        for(int i = 1; i <= M; i++) {
            st = new StringTokenizer(r.readLine());
            int s = Integer.parseInt(st.nextToken());
            int e = Integer.parseInt(st.nextToken());
            A[s].add(e);
            A[e].add(s);
        }

        int count = 0;

        for(int i = 1; i<=N; i++) {
            if(!visited[i]) {
                count++;
                DFS(i);
            }
        }

        w.write(count + "\n");


        w.flush();
        w.close();
        r.close();
    }

    private static void DFS(int i) {
        if(visited[i])
            return;

        visited[i] = true;

        for(int idx : A[i]) {
            if(!visited[idx]) {
                DFS(idx);
            }
        }
    }


}