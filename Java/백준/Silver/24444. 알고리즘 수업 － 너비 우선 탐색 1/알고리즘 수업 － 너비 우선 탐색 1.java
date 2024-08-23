import java.util.*;
import java.io.*;

public class Main {
		static List<List<Integer>> l;
		static int[] arr;
		static boolean[] visited;
		static Queue<Integer> q;
	public static void main(String[] args) throws IOException{
		//Scanner std = new Scanner(System.in);
		BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter w = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(r.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int L = Integer.parseInt(st.nextToken());
		l = new ArrayList<>();
		arr = new int[N+1];
	
		for(int i = 0; i <= N; i++) {
			l.add(new ArrayList<>());
		}
		visited = new boolean[N+1];
		
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
		
		
		bfs(L);
		
		
		
		
		w.flush();
		w.close();
		r.close();
	}
	static void bfs(int b) throws IOException {
		BufferedWriter w = new BufferedWriter(new OutputStreamWriter(System.out));
		q = new LinkedList<>();
		q.add(b);
		int count = 0;
		visited[b] = true;
		arr[b] = ++count;
		
		
		while(!q.isEmpty()) {
			int now_node = q.poll();
			for(int i : l.get(now_node)) {
				if(visited[i] == false) {
					visited[i] = true;
					arr[i] = ++count;
					q.add(i);
				}
			}
			
		}
		for(int i = 1; i <= arr.length-1; i++) {
			w.write(arr[i] + "\n");
		}
		
		
		w.flush();		
	}

}