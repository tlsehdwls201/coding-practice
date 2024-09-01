class Solution {
    public int solution(String A, String B) {
        int answer = 0;
        String temp = B.repeat(5);
        answer = temp.indexOf(A);
        return answer;
    }
}