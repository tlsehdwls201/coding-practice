import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter w = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(r.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int arr[][] = new int[N+1][N+1];
        int sum_arr[][] = new int[N+1][N+1];
        for(int i = 1; i <= N; i++) {
            st = new StringTokenizer(r.readLine());
            for(int j = 1; j <= N; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
                if(i == 1 && j == 1) {
                    sum_arr[i][j] = arr[i][j];
                    continue;
                }
                else if(i == 1 && j != 1) {
                    sum_arr[i][j] = sum_arr[i][j-1] + arr[i][j];
                }
                else if(j == 1 && i != 1) {
                    sum_arr[i][j] = sum_arr[i-1][j] + arr[i][j];
                }
                else {
                    sum_arr[i][j] = sum_arr[i-1][j] + sum_arr[i][j-1] - sum_arr[i-1][j-1] + arr[i][j];
                }

            }
        }

        int result = 0;
        for(int i = 0; i < M; i++) {
            st = new StringTokenizer(r.readLine());
            int a1 = Integer.parseInt(st.nextToken());
            int a2 = Integer.parseInt(st.nextToken());
            int b1 = Integer.parseInt(st.nextToken());
            int b2 = Integer.parseInt(st.nextToken());

            result = sum_arr[b1][b2] - sum_arr[a1-1][b2] - sum_arr[b1][a2-1] + sum_arr[a1-1][a2-1];
            w.write(result + "\n");
        }

        w.flush();
        w.close();
        r.close();
    }

}