import java.util.*;
class Solution {
    public int solution(String s) {
        int answer = 0;
        Map<String, String> m = new HashMap<>();
        m.put("zero", "0");
        m.put("one", "1");
        m.put("two", "2");
        m.put("three", "3");
        m.put("four", "4");
        m.put("five", "5");
        m.put("six", "6");
        m.put("seven", "7");
        m.put("eight", "8");
        m.put("nine", "9");
        
        String ss = s;
        
        while(true) {
    	    for(Map.Entry<String, String> e : m.entrySet()) {
				if(ss.contains(e.getKey())) {
                    ss = ss.replace(e.getKey(), e.getValue());
                }			
        	}
            char ch[] = ss.toCharArray();
            int count = 0;
            for(int i = 0; i < ch.length; i++) {
                if(Character.isDigit(ch[i])) {
                    count++;
                }
            }
            if(count == ch.length) break;
            
        }
        answer = Integer.parseInt(ss);
        return answer;
    }
}