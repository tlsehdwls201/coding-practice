import java.util.*;
class Solution {
    public String[] solution(String[] str_list) {
        String[] answer = {};
        Queue<String> q = new LinkedList<>();
        for(int i = 0; i < str_list.length; i++) {
            if(str_list[i].equals("l")) {
                for(int j = 0; j < i; j++) {
                    q.add(str_list[j]);
                }
                break;
            }
            else if(str_list[i].equals("r")) {
                for(int j = i+1; j < str_list.length; j++) {
                    q.add(str_list[j]);
                }
                break;
            }
        }
        answer = new String[q.size()];
   
        	for(int i = 0; i < answer.length; i++) {
            	answer[i] = q.poll();
        	}	
        
        return answer;
    }
}