import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter w = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(r.readLine());
		Stack<Integer> stack = new Stack<>();
		int arr[] = new int[n];
		int result[] = new int[n];
		 StringTokenizer st = new StringTokenizer(r.readLine());
		for(int i = 0; i < n; i++) {
			int a = Integer.parseInt(st.nextToken());
			arr[i] = a;
			if(stack.isEmpty()) {
				stack.push(i);
				continue;
			}
			if(arr[stack.peek()] < arr[i]) {
				while(!stack.isEmpty()) {
					if(arr[stack.peek()] >= arr[i]) {
						
						break;
					}
					else
						result[stack.pop()] = arr[i];
					
				}
				stack.push(i);
			}
			else {
				stack.push(i);
			}
			
			
		}
		for(int i = 0; i < n; i++) {
			result[stack.pop()] = -1;
			if(stack.isEmpty())
				break;
		}
		for(int i = 0; i < result.length; i++) {
			w.write((result[i]) + " ");
		}
		w.flush();
		w.close();
		r.close();
	}
}