import java.util.*;
class Solution {
    public String[] solution(String my_str, int n) {
        String[] answer = {};
        Vector v = new Vector();
        String str[] = my_str.split("");
        int i = 0;
        String ss = "";
        while(true){
            ss+= str[i];
            i++;
            if(i % n == 0) {
                v.add(ss);
                ss = "";
            }
            if(i == str.length) {
                if(ss == "")
                    break;
                v.add(ss);
                break;
            }
        }
        
        answer = new String[v.size()];
        for(int j = 0; j < answer.length; j++) {
            answer[j] = (String)v.get(j);
        }
        return answer;
    }
}