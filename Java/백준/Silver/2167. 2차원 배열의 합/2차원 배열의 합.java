import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner std = new Scanner(System.in);
		int a = std.nextInt();
		int b = std.nextInt();
		int arr[][] = new int[a][b];
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				int c = std.nextInt();
				arr[i][j] = c;
			}
		}
		
		int sum = 0;
		int d = std.nextInt();
		for(int l = 1; l <= d; l++) {
			int a1 = std.nextInt();
			int a2 = std.nextInt();
			int b1 = std.nextInt();
			int b2 = std.nextInt();
		
			for(int i = a1; i <= b1; i++) {
				for(int j = a2; j <= b2; j++) {
					sum += arr[i-1][j-1];
				}
			}
			System.out.println(sum);
			sum = 0;
		}
		
		
		
		
		
		

	}

}