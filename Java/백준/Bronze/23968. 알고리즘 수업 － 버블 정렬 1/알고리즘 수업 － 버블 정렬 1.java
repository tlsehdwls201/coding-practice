import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException{
		Scanner std = new Scanner(System.in);
		BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter w = new BufferedWriter(new OutputStreamWriter(System.out));
		//StringTokenizer st = new StringTokenizer(r.readLine());
		int N = std.nextInt();
		int cnt = std.nextInt();
		int arr[] = new int[N];
		
		for(int i = 0; i < N; i++) {
			arr[i] = std.nextInt();
		}
		int count = 0;
		int a1 = 0;
		int a2 = 0;
		Loop : for(int i = 0; i < N-1; i++) {
			for(int j = 0; j < N-i-1; j++) {
				if(arr[j] > arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
					count++;
					a1 = arr[j];
					a2 = arr[j+1];
					if(count == cnt) {
						if(a1 > a2) {
							w.write(a2 + " " + a1);
							break Loop;
						}
						else {
							w.write(a1 + " " + a2);
							break Loop;
						}
					}
				}
					
			}
		}
		if(count < cnt) {
			w.write(-1 + "\n");
		}
		w.flush();
		w.close();
		r.close();
	}
}