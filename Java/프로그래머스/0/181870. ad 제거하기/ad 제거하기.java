import java.util.*;
class Solution {
    public String[] solution(String[] strArr) {
        String[] answer = {};
        Vector v = new Vector();
        for(int i = 0; i < strArr.length;i++) {
            if(strArr[i].contains("ad"))
                continue;
            else
                v.add(strArr[i]);
        }
        answer = new String[v.size()];
        for(int i = 0; i < answer.length; i++) {
            answer[i] = (String)v.get(i);
        }
        return answer;
    }
}