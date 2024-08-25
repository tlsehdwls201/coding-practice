class Solution {
    public int solution(int n) {
        int answer = 0;
        int a = 0;
        for(int i = 1; i <= n; i++) {
            a++;
            if(Integer.toString(a).contains("3") || a % 3 == 0)
                i--;
            
        }
        answer = a;
        return answer;
    }
}