import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner std = new Scanner(System.in);
		int n = std.nextInt();
		int q = std.nextInt();
		int s[] = new int[n];
		int ss[] = new int[n];
		for(int i = 0; i < n; i++) {
			int a = std.nextInt();
			s[i] = a;
			if(i == 0) {
				ss[i] = s[i];
			}
			else
				ss[i] = ss[i-1] + s[i];
		}
		
		int sum = 0;
		for(int i = 0; i < q; i++) {
			int x = std.nextInt();
			int y = std.nextInt();
			if(x == 1) {
				sum = ss[y-1];
			}
			else
				sum = ss[y-1] - ss[x-2];
			System.out.println(sum);
			sum = 0;
		}
	
		
	}
}