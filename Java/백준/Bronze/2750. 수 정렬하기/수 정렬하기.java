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
		int l = 0;
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr.length; j++) {
				if(i == j) continue;
				if(arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
			
		}
		for(int i = arr.length-1; i >= 0; i--) {
			w.write(arr[i] + "\n");
		}
		w.flush();
		w.close();
		r.close();
	}
}