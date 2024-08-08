import java.util.*;
class Solution {
    public int[] solution(int[] numbers) {
        int[] answer = {};
        Set<Integer> s = new LinkedHashSet<>();
        for(int i = 0; i < numbers.length; i++) {
			for(int j = 0; j < numbers.length; j++) {
                if(i == j) continue;
                else
                	s.add(numbers[i] + numbers[j]);
	           }
        }
        answer = new int[s.size()];
        int o = 0;
        for(int ss : s)
            answer[o++] = ss;
        Arrays.sort(answer);
        return answer;
    }
}