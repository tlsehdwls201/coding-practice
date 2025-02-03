import java.io.*;



public class Main {
    static long count = 0;
    static int A[];
    static int tmp[];
    public static void main(String[] args) throws IOException {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter w = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(r.readLine());
        int arr[] = new int[N];
        for(int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(r.readLine());
        }

        radixSort(arr, 5);

        for(int i = 0; i < N; i++) {
            w.write(arr[i] + "\n");
        }




        w.flush();
        w.close();
        r.close();
    }

    private static void radixSort(int[] arr, int size) {
        int output[] = new int[arr.length];
        int idx = 1;
        int count = 0;
        while(count != size) {
            int bucket[] = new int[10];
            for(int i = 0; i < arr.length; i++) {
                bucket[(arr[i] / idx) % 10]++;
            }
            for(int i = 1; i < bucket.length; i++) {
                bucket[i] += bucket[i-1];
            }

            for(int i = arr.length-1; i>=0; i--) {
                output[bucket[(arr[i] / idx) % 10]-1]= arr[i];
                bucket[(arr[i]/idx) % 10]--;
            }

            for(int i = 0; i< arr.length; i++) {
                arr[i] = output[i];
            }
            idx *= 10;
            count++;
        }
    }


}