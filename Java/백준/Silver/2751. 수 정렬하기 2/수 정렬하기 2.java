import java.io.*;



public class Main {
    static int arr[];
    static int tmp[];
    public static void main(String[] args) throws IOException {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter w = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(r.readLine());
        arr = new int[N];
        tmp = new int[N];
        for(int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(r.readLine());
        }

        mergeSort(0, N-1);

        for(int i = 0; i < N; i++) {
            w.write(arr[i] + "\n");
        }




        w.flush();
        w.close();
        r.close();
    }

    private static void mergeSort(int s, int e) {
        if(e - s < 1) return;

        int m = s + (e-s) / 2;

        mergeSort(s, m);
        mergeSort(m+1, e);

        for(int i = s; i <= e; i++) {
            tmp[i] = arr[i];
        }

        int idx = s;
        int i = s; // 투 포인터
        int j = m + 1;

        while(i <= m && j <= e) {
            if(tmp[i] > tmp[j]) {
                arr[idx] = tmp[j];
                idx++;
                j++;
            }
            else {
                arr[idx] = tmp[i];
                idx++;
                i++;
            }
        }

        while(i <= m) { // 위 반복문이 종료되어도 i나 j가 조건에 충족하지 못한 경우, 지금과 같은 반복문을 실행
            arr[idx] = tmp[i];
            idx++;
            i++;
        }

        while(j <= e) {
            arr[idx] = tmp[j];
            idx++;
            j++;
        }
    }

}