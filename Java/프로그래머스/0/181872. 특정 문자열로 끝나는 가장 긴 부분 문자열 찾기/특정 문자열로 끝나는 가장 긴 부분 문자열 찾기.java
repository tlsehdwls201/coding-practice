class Solution {
    public String solution(String myString, String pat) {
        String answer = "";
        int a = myString.lastIndexOf(pat);
        System.out.println(a);
        String str[] = myString.split("");
        for(int i = 0; i < a + pat.length(); i++) {
            answer += str[i];
        }
        return answer;
    }
}