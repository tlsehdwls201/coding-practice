class Solution {
    public String solution(String phone_number) {
        String answer = "";
        String str[] = phone_number.split("");
        String s = "";
        String end = "";
        for(int i = 0; i < str.length-4; i++) {
            str[i] = "*";
            s += str[i];
        }

        for(int i = str.length-4; i < str.length; i++) {
            end += str[i];
        }
        answer = s + end;
        return answer;
    }
}