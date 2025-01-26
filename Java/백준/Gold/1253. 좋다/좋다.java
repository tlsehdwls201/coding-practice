import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter w = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(r.readLine());
        StringTokenizer st = new StringTokenizer(r.readLine());
        long arr[] = new long[N];
        for(int i = 0; i < N; i++) {
            arr[i] = Long.parseLong(st.nextToken());
        }
        Arrays.sort(arr);


        long result = 0;
        for(int i = 0; i < N; i++) {
            int start = 0;
            int end = N-1;


            while(start < end) {
                if(arr[start] + arr[end] > arr[i]) {
                    end--;
                }
                else if(arr[start] + arr[end] < arr[i]) {
                    start++;
                }
                else {
                    if(start != i && end != i) {
                        result++;
                        break;
                    }
                    else if(start == i) {
                        start++;
                    }
                    else {
                        end--;
                    }
                }
            }


        }
        w.write(result + "\n");



        w.flush();
        w.close();
        r.close();
    }

}