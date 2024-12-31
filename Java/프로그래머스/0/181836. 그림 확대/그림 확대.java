import java.util.*;
class Solution {
    public String[] solution(String[] picture, int k) {
        String[] answer = new String[picture.length*k];
        Vector v = new Vector();
        for(int i = 0; i < picture.length; i++) {
            String s = "";
           	char ch[] = picture[i].toCharArray();
            for(int j = 0; j < ch.length; j++) {
                String ss = ""+ch[j];
                s += ss.repeat(k);
                
            }
            v.add(s);            
        }
        int a = 0;
        int count = 1;
        for(int i = 0; i < answer.length; i++) {
            if(count != k) {
                answer[i] = (String)v.get(a);
                count++;
            }
            else {
                answer[i] = (String)v.get(a);
                count = 1;
                a++;
            }
            
                
        }
        return answer;
    }
}