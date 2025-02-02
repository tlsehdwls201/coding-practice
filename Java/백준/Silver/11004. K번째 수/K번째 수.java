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

    private static void quickSort(int[] arr, int S, int E, int K) {
        if(S < E) {
            int pivot = partition(arr, S, E);
            if(pivot == K)
                return;
            else if(pivot > K)
                quickSort(arr, S, pivot-1, K);
            else
                quickSort(arr, pivot + 1, E, K);
        }
    }

    private static int partition(int[] arr, int S, int E) {
        if (S + 1 == E) {
            if (arr[S] > arr[E])
                swap(arr, S, E);
            return E;
        }
        int M = (S + E) / 2;
        swap(arr, S, M);
        int pivot = arr[S];
        int i = S + 1;
        int j = E;
        while (i <= j) {
            while (j >= S && pivot < arr[j]) {
                j--;
            }
            while (i <= E && pivot > arr[i]) {
                i++;
            }
            if (i <= j) {
                swap(arr, i++, j--);
            }
        }
        arr[S] = arr[j];
        arr[j] = pivot;
        return j;
    }


        private static void swap(int[] arr, int i, int j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }