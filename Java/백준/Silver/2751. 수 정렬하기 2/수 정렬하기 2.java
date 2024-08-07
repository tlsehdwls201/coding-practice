import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter w = new BufferedWriter(new OutputStreamWriter(System.out));
		int a = Integer.parseInt(r.readLine());
		int arr[] = new int[a];
		for(int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(r.readLine());
		}
		Arrays.sort(arr);
		for(int i = 0; i < arr.length; i++) {
			w.write(arr[i] + "\n");
		}
		w.flush();
		w.close();
		r.close();
	}
}