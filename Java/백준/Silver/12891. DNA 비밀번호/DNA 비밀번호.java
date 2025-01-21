import java.util.*;
import java.io.*;

public class Main {
    static char c_arr[] = {'A', 'C', 'G', 'T'};
    static int check_arr[];
    static int arr[];
    static int checkSecret = 0; // 각 인덱스 별, arr의 값과 동일하거나 큰 개수의 모음
    public static void main(String[] args) throws IOException{
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter w = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(r.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int result = 0; // 정답 값
        check_arr = new int[4];
        arr = new int[4];
        char A[] = r.readLine().toCharArray();
        //int checkSecret = 0; // 각 인덱스 별, arr의 값과 동일하거나 큰 개수의 모음

        st = new StringTokenizer(r.readLine());
        for(int i = 0; i < check_arr.length; i++) {
            check_arr[i] = Integer.parseInt(st.nextToken());
            if(check_arr[i] == 0)
                checkSecret++;
        }

        for(int i = 0; i < M; i++) { // 부분문자열 처음 받을 때 세팅
            Add(A[i]);
        }

        if(checkSecret == 4) result++;

        //슬라이딩 윈도우
        for(int i = M; i < N; i++) {
            int j = i - M;
            Add(A[i]);
            Remove(A[j]);
            if(checkSecret == 4) result++;
        }
        w.write(result + "\n");


        w.flush();
        w.close();
        r.close();
    }

    private static void Remove(char c) {
        switch (c) {
            case 'A':
                if(arr[0] == check_arr[0]) checkSecret--;
                arr[0]--;
                break;
            case 'C':
                if(arr[1] == check_arr[1]) checkSecret--;
                arr[1]--;
                break;
            case 'G':
                if(arr[2] == check_arr[2]) checkSecret--;
                arr[2]--;
                break;
            case 'T':
                if(arr[3] == check_arr[3]) checkSecret--;
                arr[3]--;
                break;
        }
    }

    private static void Add(char c) {
        switch(c) {
            case 'A':
                arr[0]++;
                if(arr[0] == check_arr[0]) checkSecret++;
                break;
            case 'C':
                arr[1]++;
                if(arr[1] == check_arr[1]) checkSecret++;
                break;
            case 'G':
                arr[2]++;
                if(arr[2] == check_arr[2]) checkSecret++;
                break;
            case 'T':
                arr[3]++;
                if(arr[3] == check_arr[3]) checkSecret++;
                break;
        }
    }
}