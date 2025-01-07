import java.util.*;
class Solution {
    public String solution(String s, String skip, int index) {
        String answer = "";
        String ss = "abcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyz";
        String delete_s[] = skip.split("");
        for(int i = 0; i < delete_s.length; i++) {
            ss = ss.replace(delete_s[i], "");
        }
        
        String result_s[] = s.split("");
        for(int i = 0; i < s.length(); i++) {
            answer += ss.charAt(ss.indexOf(result_s[i])+index);
        }
        return answer;
    }
}