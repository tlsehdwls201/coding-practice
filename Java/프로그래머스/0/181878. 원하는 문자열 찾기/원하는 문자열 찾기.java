class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        int c = 0;
        String s1 = myString.toLowerCase();
        String s2 = pat.toLowerCase();
       	if(s1.contains(s2))
            answer = 1;
        return answer;
    }
}