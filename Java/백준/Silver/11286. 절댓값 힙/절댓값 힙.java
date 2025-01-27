import java.util.*;
import java.io.*;

public class Main {
    static int checkArr[];
    static int arr[];
    static int checkIndex;
    public static void main(String[] args) throws IOException {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter w = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(r.readLine());
        Queue<Integer> queue = new PriorityQueue<>((a1, a2) -> {
            int first = Math.abs(a1);
            int second = Math.abs(a2);
            if(first == second) {
                return a1 > a2 ? 1 : -1;
            }
            else {
                return first - second;
            }
        });

        for(int i = 0; i < N; i++) {
            int num = Integer.parseInt(r.readLine());
            if(num != 0) {
                queue.add(num);
            }
            else {
                if(queue.isEmpty()) {
                    w.write(0  + "\n");
                }
                else {
                    w.write(queue.poll() + "\n");
                }
            }
        }




        w.flush();
        w.close();
        r.close();
    }
}