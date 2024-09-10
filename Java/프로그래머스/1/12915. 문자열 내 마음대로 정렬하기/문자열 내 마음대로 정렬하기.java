import java.util.*;
class Solution {
    public String[] solution(String[] strings, int n) {
        String[] answer = {};
        List<String> l = new ArrayList<>();
        for(int i = 0; i < strings.length; i++) {
            l.add(strings[i].charAt(n) + strings[i]);
        }
        Collections.sort(l);
        answer = new String[l.size()];
        for(int i = 0; i < l.size(); i++) {
            answer[i] = l.get(i).substring(1, l.get(i).length());
        }
        return answer;
    }
}