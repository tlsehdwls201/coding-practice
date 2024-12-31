class Solution {
    public String solution(String myString) {
        String answer = "";
        String str[] = myString.split("");
        for(int i = 0; i < str.length; i++) {
            if(str[i].compareTo("l")<0) {
                answer += "l";
            }
            else {
                answer += str[i];
            }
        }
        return answer;
    }
}