import java.util.*;
class Solution {
    public int solution(int[] rank, boolean[] attendance) {
        int answer = 0;
        Map<Integer, Integer> m = new HashMap<>();
        for(int i = 0; i < rank.length; i++) {
            if(attendance[i]) {
                m.put(rank[i], i);
            }
        }
        
        int count = 0;
        int x = 10000;
        int min = 100000;
        while(count != 3) {
            for(Map.Entry<Integer, Integer> e : m.entrySet()) {
                if(min > e.getKey()) {
                    min = (int)e.getKey();
                }
            }
            answer += x*m.get(min);
            System.out.println(m);
            x /= 100;
            m.remove(min);
            min = 100000;
            count++;
        }
        return answer;
    }
}