import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter w = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(r.readLine());
        String s[] = r.readLine().split(" ");
        double sum = 0;
        double avg = 0;
        int max = 0;
        for(int i = 0; i < N; i++) {
            if(max < Integer.parseInt(s[i])) {
                max = Integer.parseInt(s[i]);
            }

        }
        double arr[] = new double[N];
        for(int i = 0; i < N; i++) {
            arr[i] = (double)(((double)Integer.parseInt(s[i]) / (double)max) * 100);
        }

        for(double add : arr) {
            sum += add;
        }

        avg = (double)(sum / N);
        w.write(""+avg);

        w.flush();
        w.close();
        r.close();
    }
}