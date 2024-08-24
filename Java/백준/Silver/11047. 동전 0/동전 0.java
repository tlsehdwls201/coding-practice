import java.util.*;
import java.io.*;

public class Main {
		
	public static void main(String[] args) throws IOException{
		//Scanner std = new Scanner(System.in);
		BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter w = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(r.readLine());
		int N = Integer.parseInt(st.nextToken());
		int price = Integer.parseInt(st.nextToken());
		
		int[] arr = new int[N];
		for(int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(r.readLine());
		}
		
		int cnt = 0;
		for(int i = N-1; i>=0; i--) {
			if(arr[i]<=price) {
				cnt += price/arr[i];
				price%=arr[i];
			}
		}
		
		w.write(cnt + "\n");
		
		
		w.flush();
		w.close();
		r.close();
	}
	
}