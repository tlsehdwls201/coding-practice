import java.util.*;
class Solution {
    public String solution(int a, int b) {
        String answer = "";
		Map<Integer, String> m = new HashMap<>();
        m.put(1, "FRI");
        m.put(2, "SAT");
        m.put(3, "SUN");
        m.put(4, "MON");
        m.put(5, "TUE");
        m.put(6, "WED");
        m.put(7, "THU");
        m.put(0, "THU");
        
        Map<Integer, Integer> mm = new HashMap<>();
        mm.put(1, 31);
        mm.put(2, 29);
        mm.put(3, 31);
        mm.put(4, 30);
        mm.put(5, 31);
        mm.put(6, 30);
        mm.put(7, 31);
        mm.put(8, 31);
        mm.put(9, 30);
        mm.put(10, 31);
        mm.put(11, 30);
        mm.put(12, 31);
        
        int aa = 0;
        for(int i = 1; i < a; i++) {
			if(mm.containsKey(i))
                aa += mm.get(i);
        }
        
        aa += b;
        //System.out.println(aa);
        answer = m.get(aa%7);
  
        return answer;
    }
}