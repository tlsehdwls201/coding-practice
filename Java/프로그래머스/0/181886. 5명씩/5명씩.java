import java.util.*;
class Solution {
    public String[] solution(String[] names) {
        String[] answer = {};
        Vector v = new Vector();
        for(int i = 0; i < names.length; i+=5) {
            v.add(names[i]);
        }
        answer = new String[v.size()];
        for(int i = 0; i < answer.length; i++) {
            answer[i] = (String)v.get(i);
        }
        return answer;
    }
}