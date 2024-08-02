class Solution {
    public int solution(int n) {
        int answer = 0;
        int a = 1;
        for(int i = 1; i <= 10; i++) {
            a *= i;
            if(a == n) {
                answer = i;
            	break;
            }
            else if(a > n) {
                answer = i - 1;
            	break;
            }
                
        }
        return answer;
    }
}