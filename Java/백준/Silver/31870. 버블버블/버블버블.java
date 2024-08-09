import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter w = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(r.readLine());
		StringTokenizer st = new StringTokenizer(r.readLine());
		int cnt_1 = 0;
		int cnt_2 = 1;
		int arr[] = new int[N];
		int brr[] = new int[N];
		for(int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		for(int i = 0; i < arr.length; i++) {
			brr[i] = arr[arr.length-1-i];
		}
		
		for(int i = 0; i < N - 1; i++) {
			for(int j = 0; j < N - 1 - i; j++) {
				if(arr[j] > arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
					cnt_1++;
				}
			}
		}
		
		
		for(int i = 0; i < N - 1; i++) {
			for(int j = 0; j < N - 1 - i; j++) {
				if(brr[j] > brr[j+1]) {
					int temp = brr[j];
					brr[j] = brr[j+1];
					brr[j+1] = temp;
					cnt_2++;
				}
			}
		}
		
		
		int answer = Math.min(cnt_1, cnt_2);
		w.write(answer + "\n");
		
		w.flush();
		w.close();
		r.close();
	}
}