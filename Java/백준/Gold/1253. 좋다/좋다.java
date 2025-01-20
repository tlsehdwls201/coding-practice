import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter w = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(r.readLine());
        String str[] = r.readLine().split(" ");
        int arr[] = new int[N];
        for(int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(str[i]);
        }

        Arrays.sort(arr);

        int k = 0;

        int count = 0;

        while(k < N) {
            int i = 0, j = arr.length-1;
            while(i < j) {
                if(k == i) {
                    i++;
                    continue;
                }
                if(k == j) {
                    j--;
                    continue;
                }

                if (arr[i] + arr[j] < arr[k]) {
                    i++;
                } else if (arr[i] + arr[j] > arr[k]) {

                    j--;
                } else {
                    count++;
                    break;
                }


            }
            k++;
        }
        w.write(count + "\n");



        w.flush();
        w.close();
        r.close();
    }
}