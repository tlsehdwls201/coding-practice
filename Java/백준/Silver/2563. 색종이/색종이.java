import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner std = new Scanner(System.in);
		boolean bool[][] = new boolean[100][100];
		
		int n = std.nextInt();
		
		for(int i = 0; i < n; i++) {
			int a = std.nextInt();
			int b = std.nextInt();
			
			for(int x = 0; x < 10; x++) {
				for(int y = 0; y < 10; y++) {
					bool[a+x][b+y] = true;
				}
			}
		}
		
		int area = 0;
		for(int i = 0; i < 100; i++) {
			for(int j = 0; j < 100; j++) {
				if(bool[i][j]) {
					area++;
				}
			}
		}
		System.out.println(area);
		
	}

}