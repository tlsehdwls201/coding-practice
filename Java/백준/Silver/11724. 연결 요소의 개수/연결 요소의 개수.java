import java.util.*;
import java.io.*;

public class Main {
	static List<List<Integer>> ss; // 2차원 배열 느낌
	static boolean visited[];
	
	public static void main(String[] args) throws IOException{
		//Scanner std = new Scanner(System.in);
		BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter w = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(r.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		ss = new ArrayList<>();
		visited = new boolean[N+1]; // 인덱스 1번째부터 비교하기 위함
		
		for(int i = 0; i <= N; i++) {
			ss.add(new ArrayList<>());
		}
		
		for(int i = 0; i < M; i++) {
			int s, e;
			String str[] = r.readLine().split(" ");
			s = Integer.parseInt(str[1]);
			e = Integer.parseInt(str[0]);
			ss.get(e).add(s);
			ss.get(s).add(e);
		}
		
		int count = 0;
		
		for(int i = 1; i < visited.length; i++) {
			if(!visited[i]) {
				count++;
				dfs(i);
			}
		}
		w.write(count + "\n");
		
		w.flush();
		w.close();
		r.close();
	}
	static void dfs(int v) {
		if(visited[v]) {
			return;
		}
		
		visited[v] = true;
		
		for(int i : ss.get(v)) {
			if(visited[i] == false) {
				dfs(i);
			}
		}
	}
}