class Solution {
    public String solution(String my_string, String alp) {
        String answer = "";
        if(my_string.contains(alp)) {
            String s = my_string.replace(alp, alp.toUpperCase());
            answer = s;
        }
        else 
            answer = my_string;
        return answer;
    }
}