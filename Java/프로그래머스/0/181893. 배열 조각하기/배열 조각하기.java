import java.util.*;
class Solution {
    public int[] solution(int[] arr, int[] query) {
        int[] answer = {};
        List<Integer> l = new ArrayList<>();
        for(int i = 0; i < arr.length; i++) {
			l.add(arr[i]);
        }
        
        
        for(int i = 0; i < query.length; i++) {
            if(i % 2 == 0) {
              
                 
                  	l = l.subList(0,query[i] + 1);
              
            }
            else {
                	
                    l = l.subList(query[i], l.size());
                
            }
        }
        answer = new int[l.size()];
        for(int i = 0; i < answer.length; i++) {
            answer[i] = l.get(i);
        }
        return answer;
    }
}