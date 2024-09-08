class Solution {
    public String solution(String s, int n) {
        String answer = "";
        char ch[] = s.toCharArray();
        for(int i = 0; i < ch.length; i++) {
            if(ch[i] == ' ') {
                answer += ch[i];
                continue;
            }
            int a = ch[i] + n;
            if(Character.isUpperCase(ch[i])) {
                if(a > 90) {
                    a = a - 26;
                }
            }
            else {
                if(a > 122) {
                    a = a - 26;
                }
            }
            char c = (char)a;
            answer += c;
        }
        return answer;
    }
}