import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter w = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(r.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        long arr[] = new long[N];
        long sum_arr[] = new long[N];
        String s[] = r.readLine().split(" ");

        for(int i = 0; i < N; i++) {
            arr[i] = Long.parseLong(s[i]);
            if(i == 0) sum_arr[i] = arr[i];
            else sum_arr[i] = sum_arr[i-1] + arr[i];
        }



        long count[] = new long[M];
        long cnt = 0;
        for(int i = 0; i < N; i++) {
            int index = (int)(sum_arr[i] % M);
            if(index == 0) cnt++;

            count[index]++;

        }

        for(int i = 0; i < M; i++) {
            if(count[i] > 1) {
                cnt += (count[i] * (count[i] - 1) / 2);
            }
        }
        w.write(cnt + "\n");



        w.flush();
        w.close();
        r.close();
    }
}