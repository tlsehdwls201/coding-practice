import java.util.*;
class Solution {
    public int[] solution(int[] num_list, int n) {
        int[] answer = {};
        Vector v = new Vector();
        for(int i = 0; i < num_list.length; i+= n) {
            v.add(num_list[i]);
        }
        answer = new int[v.size()];
        for(int i = 0; i < answer.length; i++) {
            answer[i] = (int)v.get(i);
        }
        return answer;
    }
}