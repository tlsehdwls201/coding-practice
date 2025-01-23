import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter w = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(r.readLine());
        StringTokenizer st = new StringTokenizer(r.readLine());
        Stack<Integer> stack = new Stack<>();
        int arr[] = new int[N];
        int result[] = new int[N];

        for(int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
            if(stack.isEmpty()) {
                stack.push(i);
                continue;
            }

            if(arr[stack.peek()] < arr[i]) {
                int size = stack.size();
                for(int j = 1; j <= size; j++) {
                    if(arr[stack.peek()] >= arr[i]) break;
                    result[stack.pop()] = arr[i];
                    
                }
                stack.push(i);
            }

            else {
                stack.push(i);
            }
        }

        if(!stack.isEmpty()) {
            int size = stack.size();
            for(int i = 0; i< size; i++) {
                result[stack.pop()] = -1;
            }
        }
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < result.length; i++) {
            sb.append(result[i] + " ");
        }

        w.write(sb.toString().trim());



        w.flush();
        w.close();
        r.close();
    }

}