import java.util.*;
class Solution {
    public String[] solution(String myStr) {
        String[] answer = {};
        String s = myStr.replace("a", " ");
        s = s.replace("b"," ");
        s = s.replace("c", " ");
        
        List<String> l = new ArrayList<>();
        String str[] = s.split(" ");
        for(int i = 0; i < str.length; i++) {
            if(str[i].equals(""))continue;
            l.add(str[i]);
        }
        
       	answer = new String[l.size()];
        if(l.size() == 0) {
            answer = new String[1];
            answer[0] = "EMPTY";
        }
        else { 
            for(int i = 0; i < answer.length; i++) {
                answer[i] = l.get(i);
            }
        }
        return answer;
    }
}