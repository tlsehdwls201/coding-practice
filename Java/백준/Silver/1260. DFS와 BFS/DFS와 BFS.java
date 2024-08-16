import java.util.*;
import java.io.*;

public class Main {
		static List<List<Integer>> l;
		//static Queue<Queue<Integer>> q;
		static boolean visited[];
	
	public static void main(String[] args) throws IOException{
		//Scanner std = new Scanner(System.in);
		BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter w = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(r.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken()); // 시작점
		
		l = new ArrayList<>();
		
		visited = new boolean[N + 1];
		
		for(int i = 0; i <= N; i++) {
			l.add(new ArrayList<>());
		}
		
		for(int i = 0; i < M; i++) {
			String str[] = r.readLine().split(" ");
			int a = Integer.parseInt(str[0]);
			int b = Integer.parseInt(str[1]);
			l.get(b).add(a);
			l.get(a).add(b);
			
		}
		
		for(int i = 1; i <= N; i++) {
			Collections.sort(l.get(i));
		}
		
		dfs(K);
		
		Arrays.fill(visited, false);
		System.out.println();
		bfs(K);
		
		
		w.flush();
		w.close();
		r.close();
	}
	
	static void dfs(int v) throws IOException {
		//BufferedWriter w = new BufferedWriter(new OutputStreamWriter(System.out));
		
		System.out.print(v + " ");
		
		visited[v] = true;
		
		for(int i : l.get(v)) {
			if(visited[i] == false) {
				dfs(i);
			}
		}
		
		
		
		
	}
	
	static void bfs(int b) throws IOException {
		BufferedWriter w = new BufferedWriter(new OutputStreamWriter(System.out));
		Queue<Integer> q = new LinkedList<>();
		q.add(b);
		
		visited[b] = true;
		
		while(!q.isEmpty()) {
			int node = q.peek();
			q.poll();
			System.out.print(node + " ");
			for(int i : l.get(node)) {
				if(visited[i] == false) {
					visited[i] = true;
					q.add(i);
				}
			}
		}
		
		
		
	}

}