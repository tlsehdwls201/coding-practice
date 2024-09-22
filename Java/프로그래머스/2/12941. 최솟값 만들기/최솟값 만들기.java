import java.util.*;
// 우선순위 큐 알고리즘

class Solution {
    public int solution(int []A, int []B) {
        int answer = 0;
		Queue<Integer> aq = new PriorityQueue<>();
       	Queue<Integer> bq = new PriorityQueue<>(Collections.reverseOrder()); // 내림차순
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