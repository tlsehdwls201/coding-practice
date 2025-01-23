import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter w = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(r.readLine());
        Stack<Integer> stack = new Stack<>();
        int arr[] = new int[N];
        List<String> l = new ArrayList<>();
        for(int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(r.readLine());
        }
        int j = 1;
        for(int i = 1; i <= N; i++) {

            while(j <= arr[i-1]) {
                stack.push(j);
                l.add("+");
                j++;

            }

            if(j > arr[i-1]) {
                if(arr[i-1] != stack.peek()) {
                    l.clear();
                    w.write("NO" + "\n");
                    break;
                }
                stack.pop();
                l.add("-");

            }


        }

        for(int i = 0; i < l.size(); i++) {
            w.write(l.get(i) + "\n");
        }


        w.flush();
        w.close();
        r.close();
    }
}