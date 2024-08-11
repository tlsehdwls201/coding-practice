import java.util.*;
import java.io.*;

public class Main {
	private static int arr[];
	private static int brr[];
	private static int count;
	private static int num;
	private static int cnt;
	
	public static void main(String[] args) throws IOException{
		//Scanner std = new Scanner(System.in);
		BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter w = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(r.readLine());
		int N = Integer.parseInt(st.nextToken());
		cnt = Integer.parseInt(st.nextToken());
		count = 0;
		
		num = -1;
		arr = new int[N+1];
		brr = new int[N+1];
		String str[] = r.readLine().split(" ");
		for(int i = 1; i <= N; i++) {
			arr[i] = Integer.parseInt(str[i-1]);
		}
		
		merge_sort(1, N);
		
		w.write(num + "\n");
		
		w.flush();
		w.close();
		r.close();
	}
	
	public static void merge_sort(int s, int e) {
		
		if((e-s) < 1)
			return;
		
		int m = s + (e - s) / 2;
		
		merge_sort(s, m);
		merge_sort(m+1, e);
		
		for(int i = s; i <= e; i++) {
			brr[i] = arr[i];
		}
		
		int k = s;
		int i1 = s;
		int i2 = m+1;
		
		while(i1 <= m && i2 <= e) {
			if(brr[i1] > brr[i2]) {
				arr[k] = brr[i2];
				count++;
				if(count == cnt) {
					num = arr[k];
					return;
				}
				k++;
				i2++;
			}
			else {
				arr[k] = brr[i1];
				count++;
				if(count == cnt) {
					num = arr[k];
					return;
				}
				k++;
				i1++;
			}
		}
		
		while(i1 <= m) {
			arr[k] = brr[i1];
			count++;
			if(count == cnt) {
				num = arr[k];
				return;
			}
			k++;
			i1++;
		}
		
		while(i2 <= e) {
			arr[k] = brr[i2];
			count++;
			if(count == cnt) {
				num = arr[k];
				return;
			}
			k++;
			i2++;
		}
		
		
	}
}