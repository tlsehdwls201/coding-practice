import java.util.*;
class Solution {
    public String[] solution(String[] todo_list, boolean[] finished) {
        String[] answer = {};
        Vector v = new Vector();
        for(int i = 0; i < todo_list.length; i++) {
            if(!finished[i]) {
                v.add(todo_list[i]);
            }
        }
        answer = new String[v.size()];
        for(int i = 0; i < answer.length; i++) {
            answer[i] = (String)v.get(i);
        }
        return answer;
    }
}