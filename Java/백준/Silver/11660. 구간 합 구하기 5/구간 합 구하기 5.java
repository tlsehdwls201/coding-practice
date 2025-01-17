import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter w = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(r.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int arr[][] = new int[N][N];
        int sum_arr[][] = new int[N][N];

        for (int i = 0; i < N; i++) {
            String s[] = r.readLine().split(" ");
            for (int j = 0; j < s.length; j++) {
                arr[i][j] = Integer.parseInt(s[j]);
            }
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (i == 0 && j == 0) {
                    sum_arr[i][j] = arr[i][j];
                } else if (i == 0) {
                    sum_arr[i][j] = sum_arr[i][j - 1] + arr[i][j];
                } else if (j == 0) {
                    sum_arr[i][j] = sum_arr[i - 1][j] + arr[i][j];
                } else {
                    sum_arr[i][j] = sum_arr[i - 1][j] + sum_arr[i][j - 1] - sum_arr[i - 1][j - 1] + arr[i][j];
                }
            }
        }

        for (int i = 0; i < M; i++) {
            StringTokenizer str = new StringTokenizer(r.readLine());
            int a1 = Integer.parseInt(str.nextToken());
            int a2 = Integer.parseInt(str.nextToken());
            int b1 = Integer.parseInt(str.nextToken());
            int b2 = Integer.parseInt(str.nextToken());

            int result = sum_arr[b1 - 1][b2 - 1];
            if (a1 > 1) result -= sum_arr[a1 - 2][b2 - 1];
            if (a2 > 1) result -= sum_arr[b1 - 1][a2 - 2];
            if (a1 > 1 && a2 > 1) result += sum_arr[a1 - 2][a2 - 2];

            w.write(result + "\n");
        }

        w.flush();
        w.close();
        r.close();
    }
}