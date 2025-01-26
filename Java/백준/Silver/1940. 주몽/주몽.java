import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter w = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(r.readLine());
        int M = Integer.parseInt(r.readLine());
        StringTokenizer st = new StringTokenizer(r.readLine());
        int arr[] = new int[N];
        for(int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);
        int start = 0;
        int end = N-1;
        int sum = arr[start] + arr[end];
        int result = 0;

        while(start < end) {
            if(sum < M) {
                start++;
                sum = arr[start] + arr[end];
            }
            else if(sum > M) {
                end--;
                sum = arr[start] + arr[end];
            }
            else {
                start++;
                sum = arr[start] + arr[end];
                result++;
            }
        }
        w.write(result + "\n");



        w.flush();
        w.close();
        r.close();
    }

}