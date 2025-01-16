import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter w = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(r.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        String s[] = new String[N];
        s = r.readLine().split(" ");
        int arr[] = new int[N];
        int sum_arr[] = new int[N];
        for(int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(s[i]);
            if(i == 0) {
                sum_arr[i] = arr[i];
            }
            else {
                sum_arr[i] = sum_arr[i-1] + arr[i];
            }
        }

        for(int i = 0; i < M; i++) {
            int sum = 0;
            String str[] = r.readLine().split(" ");
            int a = Integer.parseInt(str[0]);
            int b = Integer.parseInt(str[1]);

            if(a < 2) {
                sum = sum_arr[b-1];
            }
            else
                sum = sum_arr[b-1] - sum_arr[a-2];

            w.write(sum + "\n");
        }


        w.flush();
        w.close();
        r.close();
    }
}