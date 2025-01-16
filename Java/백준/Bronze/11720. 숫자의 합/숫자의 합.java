import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter w = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(r.readLine());
        String s[] = r.readLine().split("");
        int sum = 0;
        for(int i = 0; i < N; i++) {
            int a = Integer.parseInt(s[i]);
            sum += a;
        }
        w.write(""+sum);

        w.flush();
        w.close();
        r.close();
    }
}