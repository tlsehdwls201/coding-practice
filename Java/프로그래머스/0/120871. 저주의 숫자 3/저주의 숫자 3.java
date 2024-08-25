class Solution {
    public int solution(int n) {
        int answer = 0;
        int result = 0;
        while(n > 0) {
            result++;
            if(Integer.toString(result).contains("3") || result % 3==0)
                continue;
            n--;
        }
        answer = result;
        return answer;
    }
}