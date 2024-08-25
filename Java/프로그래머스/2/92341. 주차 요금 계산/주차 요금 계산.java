import java.util.*;
class Solution {
    public int[] solution(int[] fees, String[] records) {
        int[] answer = {};
        int time_gap = 0;
        
        List<Integer> l = new ArrayList<>();
        Set<String> s = new HashSet<>();
        for(int i = 0; i < records.length; i++) {
            String str[] = records[i].split(" ");
           
            s.add(str[1]);
            
        }
        List<String> al = new ArrayList<>(s);
        Collections.sort(al);
        
        int r = 0;
        for(String ss : al) {
            int result = 0;
            for(int j = 0; j < records.length; j++) {
                String str[] = records[j].split(" ");
                String t[] = str[0].split(":");
                
                if(str[1].equals(ss)) {
                    if(str[2].equals("IN")) {
                        int m1 = Integer.parseInt(t[0]) * 60 + Integer.parseInt(t[1]);
                        result -= m1;
                    }
                    else {
                        int m2 = Integer.parseInt(t[0]) * 60 + Integer.parseInt(t[1]);
                        result += m2;
                    }
                }
            }
                if(result <= 0) {
                    result += Integer.parseInt("23") * 60 + Integer.parseInt("59");
                    r = result;
                }
                else
                    r = result;
            
        	System.out.println(r);
        
            if(r <= fees[0]) {
                l.add(fees[1]);
            }
            else {
                l.add(fees[1] + (int)Math.ceil((double)(r - fees[0]) / fees[2]) * fees[3]);
            }
       
        }
        answer = new int[l.size()];
        for(int i =0; i < answer.length; i++) {
            answer[i] = (int)l.get(i);
        }
        
        return answer;
    }
}