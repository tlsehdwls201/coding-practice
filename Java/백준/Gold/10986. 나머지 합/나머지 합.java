import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter w = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(r.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        long arr[] = new long[N];
        long sum_arr[] = new long[N];
        long count = 0;
        st = new StringTokenizer(r.readLine());
        for(int i = 0; i < N; i++) {
            arr[i] = Long.parseLong(st.nextToken());
            if(i == 0) {
                sum_arr[i] = arr[i] % M;
                if(sum_arr[i] == 0) count++;
                continue;
            }
            sum_arr[i] = (sum_arr[i-1] + arr[i]) % M;

            if(sum_arr[i] == 0) count++;
        }

        long cnt[] = new long[M];
        for(int i = 0; i < N; i++) {
            cnt[(int)sum_arr[i]]++;
        }

        for(int i = 0; i < M; i++) {
            count += (cnt[i] * (cnt[i] - 1) / 2);
        }
        w.write(count + "\n");


        w.flush();
        w.close();
        r.close();
    }

}