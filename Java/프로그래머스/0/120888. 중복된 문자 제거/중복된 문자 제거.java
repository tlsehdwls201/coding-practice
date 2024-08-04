import java.util.*;
class Solution {
    public String solution(String my_string) {
        String answer = "";
        Set<String> s = new LinkedHashSet<>();
        String str[] = my_string.split("");
        for(int i = 0; i < str.length; i++) {
			s.add(str[i]);
        }
        
        for(String ss : s) {
        	answer += ss;
        }
        return answer;
    }
}