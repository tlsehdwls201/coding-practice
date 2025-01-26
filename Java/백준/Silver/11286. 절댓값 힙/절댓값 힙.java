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
        Queue<Integer> queue = new PriorityQueue<>((a1, a2) -> { // 우선순위 큐 정렬 방식(람다식)
            int first = Math.abs(a1);
            int second = Math.abs(a2);
            /* (첫 번째 요소, 두 번째 요소) 일 때, "첫 번째 요소 - 두 번째 요소" ➡️ 오름차순
            (첫 번째 요소, 두 번째 요소) 일 때, "두 번째 요소 - 첫 번째 요소" ➡️ 내림차순 */
            if(first == second)
                return a1 > a2 ? 1 : -1;
            else
                return first - second;

        });


        for(int i = 0; i < N; i++) {
            int num = Integer.parseInt(r.readLine());
            if(num != 0) {
                queue.add(num);
            }
            else {
                if(queue.isEmpty()) {
                    w.write(0 + "\n");
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