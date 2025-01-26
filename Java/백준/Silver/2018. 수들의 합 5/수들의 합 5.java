import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter w = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(r.readLine());


        int start = 1;
        int end = 1;
        int sum = start;
        int result = 0;

        while(end <= N) {

            if(sum < N) {
                end++;
                sum += end;
            }
            else if(sum > N) {
                sum -= start;
                start++;

            }
            else {
                end++;
                sum += end;
                result++;
            }
        }
        w.write(result + "\n");


        w.flush();
        w.close();
        r.close();
    }

}