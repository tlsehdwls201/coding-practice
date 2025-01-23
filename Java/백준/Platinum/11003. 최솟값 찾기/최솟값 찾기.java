import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter w = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(r.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(r.readLine());
        Deque<Node> deque = new LinkedList<>(); // 덱 자료구조 이용
        for(int i = 0; i < N; i++) {
            int now = Integer.parseInt(st.nextToken());

            while(!deque.isEmpty() && deque.getLast().value > now) {
                deque.removeLast();
            }

            deque.addLast(new Node(i, now));

            if(deque.getFirst().index <= i - M) {
                deque.removeFirst();
            }

            w.write(deque.getFirst().value + " ");

        }


        w.flush();
        w.close();
        r.close();
    }
    static class Node {
        private int index;
        private int value;

        public Node(int i, int v) {
            this.index = i;
            this.value = v;
        }
    }
}