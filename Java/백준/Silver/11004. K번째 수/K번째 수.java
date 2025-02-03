import java.util.*;
import java.io.*;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter w = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(r.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(r.readLine());
        int arr[] = new int[N];
        for(int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        quickSort(arr, 0, N-1, K-1);

        w.write(arr[K-1] + "\n");


        w.flush();
        w.close();
        r.close();
    }

    private static void quickSort(int[] arr, int s, int e, int k) {
        if(s < e) {
            int pivot = partition(arr, s, e);
            if(k == pivot) {
                return;
            }
            else if(pivot > k) {
                quickSort(arr, s, pivot - 1, k);
            }
            else {
                quickSort(arr, pivot+1, e, k);
            }
        }
    }

    private static int partition(int[] arr, int s, int e) {
        if(s + 1 == e) {
            if(arr[s] > arr[e]) swap(arr, s, e);
            return e;
        }

        int m = (e + s) / 2;
        swap(arr, s, m);
        int pivot = arr[s];
        int i = s + 1;
        int j = e;
        while(i <= j) {
            while(j >= s+1 && pivot < arr[j]) {
                j--;
            }
            while(i <= e && pivot > arr[i]) {
                i++;
            }
            if(i <= j) {
                swap(arr, i++, j--);
            }
        }
        arr[s] = arr[j];
        arr[j] = pivot;
        return j;
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

}