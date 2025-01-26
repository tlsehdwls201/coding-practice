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
        Queue<Integer> queue = new LinkedList<>();
        for(int i = 1; i <= N; i++) {
            queue.add(i);
        }

        while(queue.size() != 1) {
            queue.remove();
            int a = queue.remove();
            queue.add(a);
        }
        w.write(queue.peek() + "\n");

        w.flush();
        w.close();
        r.close();
    }
}