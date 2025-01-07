import java.util.*;
class Solution {
    public int[] solution(int N, int[] stages) {
        int[] answer = new int[N];
        Map<Integer, Double> map = new HashMap<>();
        int stage_pass = stages.length;
        for(int i = 1; i <= N; i++) {
            int cnt = 0;
            int count = 0;
            for(int j = 0; j < stages.length; j++) {
                if(i == stages[j]) cnt++; // 분자
                if(i <= stages[j]) count++; // 분모
                
            }
            if(cnt == 0) map.put(i, 0.0);
            else
           	 map.put(i, (double)cnt/(double)count);
            
        }
        List<Integer> l = new ArrayList<>(map.keySet());
        Collections.sort(l, (s1, s2) -> map.get(s2).compareTo(map.get(s1)));
        for(int i = 0; i < N; i++) {
            answer[i] = (int)l.get(i);
        }
        return answer;
    }
}