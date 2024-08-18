import java.util.*;
import java.io.*;

public class Main {
		static List<List<Integer>> l;
		
		static int arr[];
		static boolean visited[];
		static int count = 0;
	public static void main(String[] args) throws IOException{
		//Scanner std = new Scanner(System.in);
		BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter w = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(r.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int L = Integer.parseInt(st.nextToken()); // 시작점
		
		arr = new int[N + 1];
		visited = new boolean[N + 1];
		l = new ArrayList<>();
		
		for(int i = 0; i <= N; i++) {
			l.add(new ArrayList<>());
		}
		
		
		for(int i = 0; i < M; i++) {
			String str[] = r.readLine().split(" ");
			int a = Integer.parseInt(str[0]);
			int b = Integer.parseInt(str[1]);
			l.get(a).add(b);
			l.get(b).add(a);
			
		}
		
		for(int i = 1; i <= N; i++) {
			Collections.sort(l.get(i));
		}
		dfs(L);
		/*for(int i = 1; i <= N; i++) {
			if(visited[i])
				w.write(i + "\n");
			else
				w.write(0 + "\n");
		} */
			
		for(int i = 1; i < arr.length; i++) {
			w.write(arr[i] + "\n");
		}
		
		w.flush();
		w.close();
		r.close();
		
	}
	static void dfs(int v) throws IOException {
		//BufferedWriter w = new BufferedWriter(new OutputStreamWriter(System.out));
		
		if(visited[v]) {
			return;
		}
		
		visited[v] = true;
		
		arr[v] = ++count;
		
		for(int i : l.get(v)) {
			if(visited[i] == false) {
				dfs(i);
			}
		}
		
	
	}
	

}