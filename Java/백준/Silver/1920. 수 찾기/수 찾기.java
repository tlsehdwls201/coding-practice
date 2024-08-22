import java.util.*;
import java.io.*;

public class Main {
		
	public static void main(String[] args) throws IOException{
		//Scanner std = new Scanner(System.in);
		BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter w = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(r.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		
		int[] arr = new int[N];
		String s1[] = r.readLine().split(" ");
		for(int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(s1[i]);
		}
		Arrays.sort(arr);
		int M = Integer.parseInt(r.readLine());
		String s2[] = r.readLine().split(" ");
		for(int i = 0; i < M; i++) {
			boolean t = false;
		
			int x = 0;
			int y = arr.length-1;
			while(x <= y) {
				
				int middle_index = (x + y) / 2;
				int middle_result = arr[middle_index];
				if(Integer.parseInt(s2[i]) > middle_result) {
					x = middle_index + 1;
					
				}
				else if(Integer.parseInt(s2[i]) < middle_result) {
					y = middle_index - 1;
					
				}
				else {
					t = true;
					break;
				}
			}
			
			if(t)
				w.write(1 + "\n");
			else
				w.write(0 + "\n");
		}
		
		
		w.flush();
		w.close();
		r.close();
	}
	

}