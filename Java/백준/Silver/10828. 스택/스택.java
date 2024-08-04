import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter w = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(r.readLine());
		Stack<Integer> s = new Stack<>();
		for(int i = 0; i < n; i++) {
			String input = r.readLine();
			String str[] = input.split(" ");
			if(str[0].equals("push")) {
				s.push(Integer.parseInt(str[1]));
			}
			else if(str[0].equals("pop")) {
				if(s.size() == 0)
					w.write(-1 + "\n");
				else
					w.write(s.pop() + "\n");
			}
			else if(str[0].equals("empty")) {
				int a = 0;
				if(s.isEmpty()) {
					a = 1;
					w.write(a + "\n");
				}
				else
					w.write(a + "\n");
			}
			else if(str[0].equals("size")) {
				w.write(s.size() + "\n");
			}
			else if(str[0].equals("top")) {
				if(s.size() == 0) {
					w.write(-1 + "\n");
				}
				else
					w.write(s.peek() + "\n");
			}
		}
		w.flush();
		w.close();
		r.close();
	}
}