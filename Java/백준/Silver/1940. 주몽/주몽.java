import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter w = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(r.readLine());
        int M = Integer.parseInt(r.readLine());

        int arr[] = new int[N];
        String str[] = r.readLine().split(" ");
        for(int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(str[i]);
        }
        int i = 0;
        int j = arr.length-1;

        Arrays.sort(arr);

        int result = 0;
        while(i < j) {
            if(arr[i] + arr[j] < M) {
                i++;
            }
            else if(arr[i] + arr[j] > M) {
                j--;
            }
            else {
                result++;
                i++;
            }
        }
        w.write(result + "\n");




        w.flush();
        w.close();
        r.close();
    }
}