import java.util.*;
class Solution {
    public int solution(int n) {
        int answer = 0;
        Set<Integer> s = new HashSet<>();
        //에라토스테네스의 체
        for(int i = 2; i <= Math.sqrt(n); i++) {
            for(int j = i+i; j<= n; j+=i) {
                if(j % i == 0)
                    s.add(j);
            }
            
        }
        if(n < 4)
            answer = 0;
        else
        	answer = s.size();
        return answer;
    }
}