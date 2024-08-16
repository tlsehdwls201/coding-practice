class Solution {
    public int solution(int num, int k) {
        int answer = -1;
        String str[] = Integer.toString(num).split("");
        for(int i = 0; i < str.length; i++) {
            if(Integer.parseInt(str[i]) == k) {
                answer = i+1;
                break;
            }
        }
        return answer;
    }
}