import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter w = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(r.readLine());

        long sum = 1; // 1부터 투 포인터가 이동해가며 sum에 값을 저장해 나가기 때문에 1로 초기화
        int start_idx = 1;
        int end_idx = 1;
        int cnt = 1; // N값 포함한 경우의 수를 저장하는 변수라 이를 1로 지정
        while(end_idx != N) {
            if(sum < N) {

                end_idx++;
                sum += end_idx;
            }
            else if(sum > N) {
                sum -= start_idx;
                start_idx++;
            }
            else {
                end_idx++;
                sum += end_idx;
                cnt++;
            }
        }
        w.write(cnt+"\n");


        w.flush();
        w.close();
        r.close();
    }
}