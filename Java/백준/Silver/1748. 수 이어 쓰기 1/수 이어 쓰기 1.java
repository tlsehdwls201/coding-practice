import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner std = new Scanner(System.in);
		int a = std.nextInt();
		int count = 0;
		for(int i = 1; i <= a; i*=10) {
			count += a - i + 1;
		}
		System.out.println(count);
		
		
		
		
		

	}

}