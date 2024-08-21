import java.util.*;
class Solution {
    public int solution(String my_string) {
        int answer = 0;
        String s = "";
        char ch[] = my_string.toCharArray();
        for(int i = 0; i < ch.length; i++) {
            if(Character.isDigit(ch[i])) {
                s += ch[i];
            }
            else
                if(s.length() == 0)
                    s = "";
            	else
                	s += " ";
        }
        String str[] = s.split(" ");
        for(int i =0; i < str.length; i++) {
            if(!str[i].equals("")) {
                answer += Integer.parseInt(str[i]);
            }
        }
        return answer;
    }
}