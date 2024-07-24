import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner std = new Scanner(System.in);
		int n = std.nextInt();
		int m = std.nextInt();
		
		long a[] = new long[n];
		long s[] = new long[n]; // 구간 합
		for(int i = 0; i < n; i++) {
			a[i] = std.nextInt();
			if(i == 0) {
				s[i] = a[i];
				continue;
			}
			s[i] = s[i-1] + a[i];
		}
		// System.out.println(Arrays.toString(s));
		long result = 0;
		long s_m[] = new long[m]; // 나머지 값과 같은 인덱스를 증가시켜 이 인덱스 값을 가지고 나중에 경우의 수를 구할 때 사용하기 위해 만듦.
		for(int i = 0; i < n; i++) {
			if(s[i] % m == 0)
				result++;
			if(n == 1)
				s_m[0]++;
			else
				s_m[(int)(s[i] % m)]++; // 인덱스 값 증가  ex) {0,1,0} -> 나머지가 1일 때 인덱스 증가
		}
		for(int i = 0; i < m; i++) {
			if(s_m[i] > 1)
				result = result + s_m[i] * (s_m[i]-1)/2; // 경우의 수 도출
		}
		System.out.println(result);
		
	}
}
