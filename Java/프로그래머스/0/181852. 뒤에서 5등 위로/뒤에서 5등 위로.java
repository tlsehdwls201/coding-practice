import java.util.*;
class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = {};
        Arrays.sort(num_list);
        List<Integer> l = new ArrayList<>();
        for(int i = num_list.length-1; i >= 0; i--) {
            l.add(num_list[i]);
        }
        
        answer = new int[l.size()-5];
        for(int i = 0; i < answer.length; i++) {
            answer[i] = (int)l.get(i);
        }
       	Arrays.sort(answer);
        return answer;
    }
}