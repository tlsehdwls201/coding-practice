import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter w = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(r.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(r.readLine());
        int arr[] = new int[N+1];
        int sum_arr[] = new int[N+1];
        for(int i = 1; i <= N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
            if(i == 1) {
                sum_arr[i] = arr[i];
                continue;
            }
            sum_arr[i] = sum_arr[i-1] + arr[i];
        }

        int result = 0;
        for(int i = 0; i < M; i++) {
            st = new StringTokenizer(r.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            result = sum_arr[b] - sum_arr[a-1];
            w.write(result + "\n");
        }

        w.flush();
        w.close();
        r.close();
    }

}