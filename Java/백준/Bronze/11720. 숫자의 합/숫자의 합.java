import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner std = new Scanner(System.in);
		int n = std.nextInt();
		String s = "";
		
			s = std.next();
		
		String str[] = s.split("");
		int sum = 0;
		for(int i = 0; i < str.length; i++) {
			sum += Integer.parseInt(str[i]);
		}
		System.out.println(sum);
	}
}