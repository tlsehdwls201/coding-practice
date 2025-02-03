import java.util.*;
import java.io.*;



public class Main {
    static long count = 0;
    static int A[];
    static int tmp[];
    public static void main(String[] args) throws IOException {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter w = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(r.readLine());
        A = new int[N];
        tmp = new int[N];
        StringTokenizer st = new StringTokenizer(r.readLine());
        for(int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(st.nextToken());
        }

        mergeSort(0, N-1);



        w.write(count + "\n");




        w.flush();
        w.close();
        r.close();
    }


    private static void mergeSort(int s, int e) {
        if(e - s < 1) return;

        int m = s + (e - s) / 2;

        mergeSort(s, m);
        mergeSort(m+1, e);
        for(int i= s; i <= e; i++) {
            tmp[i] = A[i];
        }

        int idx = s;
        int i = s;
        int j = m + 1;
        while(i <= m && j <= e) {
            if(tmp[i] > tmp[j]) {
                A[idx] = tmp[j];
                count += j - idx;
                idx++;
                j++;

            }
            else {
                A[idx] = tmp[i];
                idx++;
                i++;
                
            }
        }

        while(i <= m) {
            A[idx] = tmp[i];
            idx++;
            i++;
            //count++;
        }

        while(j <= e) {
            A[idx] = tmp[j];
            idx++;
            j++;
           // count++;
        }


    }


}