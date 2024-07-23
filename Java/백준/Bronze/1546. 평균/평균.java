import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner std = new Scanner(System.in);
		int n = std.nextInt();
		int max = 0;
		double s[] = new double[n];
		for(int i = 0; i < n; i++) {
			int p = std.nextInt();
			if(max < p)
				max = p;
			s[i] = p;
		}
		
		double result = 0;
		
		for(int i = 0; i < s.length; i++) {
			result += (s[i]/max) * 100;
		}
		result /= n;
		System.out.println(result);
		
	}
}