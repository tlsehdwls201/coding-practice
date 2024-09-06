class Solution {
    public boolean solution(String s) {
        boolean answer = false;
        String str[] = s.split("");
        for(int i = 0; i < str.length; i++) {
            if((str.length == 4 || str.length == 6) && Character.isDigit(str[i].charAt(0))) {
                answer = true;
            }
            else {
                answer = false;
                break;
            }
            
        }
        return answer;
    }
}