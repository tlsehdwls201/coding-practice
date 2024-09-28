import java.util.*;
class Solution {
    public String[] solution(String myString) {
        String[] answer = {};
        String str[] = myString.split("x");
        List<String> l = new ArrayList<>();
        for(int i = 0; i < str.length; i++) {
            if(str[i].equals(""))continue;
            l.add(str[i]);
        }
        answer = new String[l.size()];
        for(int i = 0; i < answer.length; i++) {
            answer[i] = l.get(i);
        }
        Arrays.sort(answer);
        return answer;
    }
}