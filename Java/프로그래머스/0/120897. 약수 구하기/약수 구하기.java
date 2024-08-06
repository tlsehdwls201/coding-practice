import java.util.*;
class Solution {
    public int[] solution(int n) {
        int[] answer = {};
        Vector v = new Vector();
        for(int i = 1; i <= n; i++) {
            if(n % i == 0)
                v.add(i);
        }
        answer = new int[v.size()];
        for(int i = 0; i < answer.length; i++) {
            answer[i] = (int)v.get(i);
        }
        return answer;
    }
}