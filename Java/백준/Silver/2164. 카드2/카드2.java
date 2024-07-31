import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter w = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(r.readLine());
		Queue<Integer> q = new LinkedList<>();
		for(int i = 1; i <= n; i++) {
			q.add(i);
		}
		while(q.size() != 1) {
				q.poll();
				q.add(q.peek());
				q.poll();
			
		}
		w.write(q.poll() + "\n");
		w.flush();
		w.close();
		r.close();
	}
}