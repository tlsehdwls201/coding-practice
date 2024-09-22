import java.util.*;
class Solution {
    public int solution(int []A, int []B) {
        int answer = 0;
		Queue<Integer> aq = new PriorityQueue<>();
       	Queue<Integer> bq = new PriorityQueue<>(Collections.reverseOrder());
        for(int i = 0; i < A.length; i++) {
            aq.add(A[i]);
            bq.add(B[i]);
        }
        
        
        
        for(int i = 0; i < A.length; i++) {
            answer += aq.poll() * bq.poll();
        }

        return answer;
    }
}