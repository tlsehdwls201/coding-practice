import java.util.*;
class Solution {
    public int solution(String before, String after) {
        int answer = 0;
        String a[] = before.split("");
        String b[] = after.split("");
        Arrays.sort(a);
        Arrays.sort(b);
        String s1 = "";
        String s2 = "";
        for(int i = 0; i < a.length; i++) {
            s1 += a[i];
            s2 += b[i];
        }
        if(s1.equals(s2)) {
            answer = 1;
        }
        return answer;
    }
}