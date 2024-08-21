import java.util.*;
class Solution {
    public String[] solution(String my_string) {
        String[] answer = {};
        Vector v = new Vector();
        String s = my_string.trim();
        String ss[] = s.split(" ");
        for(int i = 0; i < ss.length; i++) {
			if(ss[i].equals(""))
                continue;
            else
                v.add(ss[i]);
        }
        answer = new String[v.size()];
        for(int i = 0; i < answer.length; i++) {
            answer[i] = (String)v.get(i);
        }
        return answer;
    }
}
