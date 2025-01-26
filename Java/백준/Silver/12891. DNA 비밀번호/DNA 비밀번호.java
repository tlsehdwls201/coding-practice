import java.util.*;
import java.io.*;

public class Main {
    static int checkArr[];
    static int arr[];
    static int checkIndex;
    public static void main(String[] args) throws IOException {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter w = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(r.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        char dna[] = r.readLine().toCharArray();
        checkArr = new int[4];
        arr = new int[4];
        checkIndex = 0;
        st = new StringTokenizer(r.readLine());
        for(int i = 0; i < checkArr.length; i++) {
            checkArr[i] = Integer.parseInt(st.nextToken());
            if(checkArr[i] == 0) checkIndex++;
        }

        for(int i = 0; i < M; i++) {
            Add(dna[i]);
        }
        int result = 0;

        if(checkIndex == 4) {
            result++;
        }

        for(int i = M; i < N; i++) {
            int j = i - M;
            Add(dna[i]);
            Remove(dna[j]);
            if(checkIndex == 4) result++;
        }
        w.write(result + "\n");

        w.flush();
        w.close();
        r.close();
    }

    private static void Remove(char c) {
        switch(c) {
            case 'A':
                if(arr[0] == checkArr[0]) checkIndex--;
                arr[0]--;
                break;
            case 'C':
                if(arr[1] == checkArr[1]) checkIndex--;
                arr[1]--;
                break;
            case 'G':
                if(arr[2] == checkArr[2]) checkIndex--;
                arr[2]--;
                break;
            case 'T':
                if(arr[3] == checkArr[3]) checkIndex--;
                arr[3]--;
                break;
        }
    }

    private static void Add(char c) {
        switch(c) {
            case 'A':
                arr[0]++;
                if(arr[0] == checkArr[0]) checkIndex++;
                break;
            case 'C':
                arr[1]++;
                if(arr[1] == checkArr[1]) checkIndex++;
                break;
            case 'G':
                arr[2]++;
                if(arr[2] == checkArr[2]) checkIndex++;
                break;
            case 'T':
                arr[3]++;
                if(arr[3] == checkArr[3]) checkIndex++;
                break;
        }
    }

}