import java.util.*;
class Solution {
    public int solution(int[][] lines) {
       	int answer = 0;
        Map<Integer, Integer> m = new HashMap<>();
        for(int i =0; i < lines.length; i++) {
            for(int j = lines[i][0]; j < lines[i][1]; j++) {
                m.put(j, m.getOrDefault(j, 0) + 1);
            }
        }
       
        int count = 0;
      	
        for(Map.Entry<Integer, Integer> e : m.entrySet()) {
            if(e.getValue() != 1)
                count++;
        }
        answer = count;
        return answer;
    }
}