import java.util.*;
class Solution {
    public String solution(String my_string) {
        String answer = "";
        String s = my_string.toLowerCase();
        char ch[] = s.toCharArray();
        Arrays.sort(ch);
        for(int i = 0; i < ch.length; i++) {
            answer += ch[i];
        }
        return answer;
    }
}