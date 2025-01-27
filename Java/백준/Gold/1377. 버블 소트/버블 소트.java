import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter w = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(r.readLine());
        int A[] = new int[N];
        for(int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(r.readLine());
        }

        Map<Integer, Integer> map1 = new HashMap<>();
        Map<Integer, Integer> map2 = new HashMap<>();

        for(int i = 0; i < N; i++) {
            map1.put(A[i], i);

        }
        Arrays.sort(A);
        for(int i = 0; i < N; i++) {
            map2.put(A[i], i);
        }


        int max = 0;
        for(int i = 0; i < N; i++) {
            if(max < map1.get(A[i]) - map2.get(A[i])) {
                max = map1.get(A[i]) - map2.get(A[i]);
            }
        }

        w.write(++max + "\n"); // 최대값에 1을 더하는 이유는 문제에서 swap이 한번도 일어나지 않은 루프가 언제인지를 알고자 하는 것임
        // max 값은 swap이 일어난 루프이며 1을 더해야 swap이 일어나지 않은 루프의 값이 나옴.



        w.flush();
        w.close();
        r.close();
    }
}