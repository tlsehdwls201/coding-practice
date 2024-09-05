import java.util.*;
class Solution {
    public int solution(int[] ingredient) {
        int answer = 0;
		List<Integer> l = new ArrayList<>();
        for(int i : ingredient) {
            l.add(i);
        }
        for(int i = 0; i < l.size()-3; i++) {
            if(l.get(i) == 1 && l.get(i+1) == 2 && l.get(i+2) == 3 && l.get(i+3) == 1) {
                l.remove(i);
                l.remove(i);
                l.remove(i);
                l.remove(i);
                answer++;
                if(i >= 0)
                    i -= 3;
                if(i <= -2) 
                    i = -1;
            }
        }
        return answer;
    }
}