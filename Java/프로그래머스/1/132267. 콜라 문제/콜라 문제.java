class Solution {
    public int solution(int a, int b, int n) {
        int answer = 0;
        int sum = 0;
        int aum = 0;
        int mod = 0;
        while(n >= a) {
            sum += b * ((n) / a);
            aum = b * (n / a);
            mod = (n % a);
            n = aum;
            n += mod;
            
            System.out.print(n + " ");
            System.out.println(mod);
            System.out.println(sum);
        }
        answer = sum;
        return answer;
    }
}