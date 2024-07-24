import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner std = new Scanner(System.in);
		int x = std.nextInt();
		int y = std.nextInt();
		int[][] arr = new int[x][x];
		int[][] s = new int[x+1][x+1];
		
		for(int i = 1; i <= x; i++) {
			for(int j = 1; j <= x; j++) {
				arr[i-1][j-1] = std.nextInt();
				if(i == 1 && j == 1)
					s[i][j] = arr[i-1][j-1];
				else if(i == 1)
					s[i][j] = s[i][j-1] + arr[i-1][j-1];
				else if(j == 1)
					s[i][j] = s[i-1][j] + arr[i-1][j-1];
				else
					s[i][j] = s[i-1][j] + s[i][j-1] - s[i-1][j-1] + arr[i-1][j-1];
			}
		}
		// System.out.println(Arrays.toString(s[1]));
		int result = 0;
		for(int i = 0; i < y; i++) {
			int a1 = std.nextInt();
			int a2 = std.nextInt();
			int b1 = std.nextInt();
			int b2 = std.nextInt();
			
			result = s[b1][b2] - s[a1-1][b2] - s[b1][a2-1] + s[a1-1][a2-1];
			System.out.println(result);
			result = 0;
		}
		
		
	}
}
