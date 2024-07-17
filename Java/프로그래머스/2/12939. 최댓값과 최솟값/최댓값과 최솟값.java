import java.util.*;
class Solution {
    public String solution(String s) {
        String answer = "";
        int max = -2147000000;
        int min = 2147000000;
        String str[] = s.split(" ");
        for(int i = 0; i < str.length; i++) {
            if(Integer.parseInt(str[i]) > max)
                max = Integer.parseInt(str[i]);
            if(Integer.parseInt(str[i]) < min)
                min = Integer.parseInt(str[i]);
        }
        answer = Integer.toString(min) + " " + Integer.toString(max);
        return answer;
    }
}