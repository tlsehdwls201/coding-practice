import java.util.*;
class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        int count = 0;
        Set<Integer> s = new HashSet<>();
        for(int i = 0; i < lottos.length; i++) {
            if(lottos[i] == 0)
                count++;
            for(int j = 0; j < win_nums.length; j++) {
                if(lottos[i] == win_nums[j]) {
                    s.add(lottos[i]);
                }
            }
        }
        Map<Integer, Integer> m = new HashMap<>();
        m.put(6, 1);
        m.put(5, 2);
        m.put(4, 3);
        m.put(3, 4);
        m.put(2, 5);
        m.put(1, 6);
        m.put(0, 6);
        
        answer[0] = m.get(s.size() + count);
        answer[1] = m.get(s.size());
        
        
        return answer;
    }
}