import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter w = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(r.readLine());
		Stack<Integer> s = new Stack<>();
		int count = 1;
		Vector v = new Vector();
		for(int i = 0; i < n; i++) {
			int a = Integer.parseInt(r.readLine());
			if(count <= a) {
				while(true) {
					s.push(count);
					v.add("+");
					
					if(count == a ) {
						s.pop();
						v.add("-");
						count++;
						break;
					}
					count++;
				}
			}
			
			else {
				if(s.peek() != a) {
					v.clear();
					v.add("NO");
					break;
				}
				else {
					s.pop();
					v.add("-");
				}	
			}
		}
		for(int i = 0; i < v.size(); i++) {
			w.write(v.get(i) + "\n");
			
		}
		w.flush();
		w.close();
		r.close();
	}
}