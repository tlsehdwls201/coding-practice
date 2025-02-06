import java.util.*;
class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        int[] answer = {};
        int criterial = 0;
        Stack<Integer> stack = new Stack<>();
        List<Integer> l = new ArrayList<>();
        for(int i = 0; i < speeds.length; i++) {
            int count = 0;
            while(progresses[i] < 100) {
                progresses[i] += speeds[i];
                count++;
            }
            if(i == 0) {
            	criterial = count;
                stack.push(criterial);
                continue;
            }
            if(criterial >= count) {
                stack.push(count);
            }
            else {
                l.add(stack.size());
                stack.clear();
                criterial = count;
                stack.push(count);
            }
        }
        if(!stack.isEmpty()) {
            l.add(stack.size());
        }
        
        answer = new int[l.size()];
        for(int i = 0; i < answer.length; i++) {
            answer[i] = (int)l.get(i);
        }
        return answer;
    }
}