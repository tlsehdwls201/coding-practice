import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter w = new BufferedWriter(new OutputStreamWriter(System.out));
        String n[] = r.readLine().split("");
        int arr[] = new int[n.length];
        for(int i = 0; i < n.length; i++) {
            arr[i] = Integer.parseInt(n[i]);
        }

        int index = 0;
        int max = -1;
        while(index < n.length) {
            int idx = 0;
            for(int i = index; i < n.length; i++) {
                if(max < arr[i]) {
                    max = arr[i];
                    idx = i;
                }
            }
            int temp = arr[index];
            arr[index] = arr[idx];
            arr[idx] = temp;
            max = -1;
            index++;
        }

        for(int i = 0; i < arr.length; i++) {
            w.write(Integer.toString(arr[i]));
        }
        w.write("\n");

        w.flush();
        w.close();
        r.close();
    }
}