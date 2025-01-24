import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter w = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(r.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(r.readLine());
        Deque<A> deque = new LinkedList<>();
        List<Integer> l = new ArrayList<>();

        for(int i = 0; i < N; i++) {
            int now = Integer.parseInt(st.nextToken());
            while(!deque.isEmpty() && deque.getLast().value > now) {
                deque.removeLast();
            }
            deque.addLast(new A(i,now));

            if(i - M >= deque.getFirst().index) {
                deque.removeFirst();
            }
            w.write(deque.getFirst().value + " ");


        }



        w.flush();
        w.close();
        r.close();
    }
    static class A {
        private int index;
        private int value;

        public A(int i, int v) {
            this.index = i;
            this.value = v;
        }
    }
}