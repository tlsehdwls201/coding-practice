import java.util.*;
class Solution {
    public int[] solution(String[] keymap, String[] targets) {
        int[] answer = new int[targets.length];  
        Map<Character ,Integer> m = new HashMap<>();
        for(int i = 0; i < keymap.length; i++) {
            String s = keymap[i];
            char str[] = s.toCharArray();
            for(int j = 0; j < str.length; j++) {
                if(m.containsKey(str[j])) {
                    m.put(str[j],Math.min(m.get(str[j]), j+1));
                }
                else
                	m.put(str[j], j+1);
            }
        }
        
        for(int i = 0; i < targets.length; i++) {
            int sum = 0;
            String x = targets[i];
            char ch[] = x.toCharArray();
            for(int j = 0; j < ch.length; j++) {
                if(m.containsKey(ch[j])) {
                    sum += m.get(ch[j]);
                }
                else {
                    sum = -1;
                    break;
                }
                
            }
            if(sum <= 0)
                answer[i] = -1;
            else
            	answer[i] = sum;
        }
        /* for(Map.Entry<Character, Integer> e : m.entrySet()) {
            System.out.print(e.getKey());
            System.out.println();
            System.out.print(e.getValue());
        } */
        
        
        return answer;
    }
}