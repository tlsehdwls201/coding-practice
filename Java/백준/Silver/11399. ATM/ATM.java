import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter w = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(r.readLine());
        StringTokenizer st = new StringTokenizer(r.readLine());
        int arr[] = new int[N];
        int sumArr[] = new int[N];

        for(int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);

        for(int i = 0; i < N; i++) {
            if(i == 0) sumArr[i] = arr[i];
            else {
                sumArr[i] = sumArr[i-1] + arr[i];
            }
        }

        int sum = 0;
        for(int i = 0; i < N; i++) {
            sum += sumArr[i];
        }

        w.write(sum + "\n");

        w.flush();
        w.close();
        r.close();
    }
}