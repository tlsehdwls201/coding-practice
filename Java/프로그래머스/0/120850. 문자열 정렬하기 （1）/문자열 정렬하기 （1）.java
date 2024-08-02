import java.util.*;
class Solution {
    public int[] solution(String my_string) {
        int[] answer = {};
        Vector v = new Vector();
        char ch[] = my_string.toCharArray();
        String str[] = my_string.split("");
        for(int i = 0; i < ch.length; i++) {
            if(Character.isDigit(ch[i]))
                v.add(Integer.parseInt(str[i]));
        }
        answer = new int[v.size()];
        for(int i = 0; i < v.size(); i++) {
            answer[i] = (int)v.get(i);
        }
        Arrays.sort(answer);
        return answer;
    }
}