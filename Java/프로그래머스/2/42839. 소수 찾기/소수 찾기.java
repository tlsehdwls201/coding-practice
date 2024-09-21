import java.util.*;
class Solution {
    Set<Integer> s = new HashSet<>();
    public int solution(String numbers) {
        int answer = 0;
        boolean[] visited = new boolean[numbers.length()];
        for(int i = 0; i < numbers.length(); i++) {
            dfs(numbers, i+1, "", 0, visited);
        }
        return s.size();
    }
    
    //dfs
    private void dfs(String numbers, int range, String now, int idx, boolean visit[]) {
        if(range == idx) {
            int num = Integer.parseInt(now);
            if(isPrime(num)) s.add(num);
            
        }
        
        for(int i = 0; i < numbers.length(); i++) {
            if(visit[i]) continue;
            
            visit[i] = true;
            dfs(numbers, range, now+numbers.charAt(i), idx+1, visit);
            visit[i] = false;
        }    
            return;
        
    }
    //소수 판별하는 메소드 생성
    private boolean isPrime(int n) {
        boolean result = true;
        if(n < 2) result = false;
        if(n == 2) result = true;
        for(int i = 2; i <= Math.sqrt(n); i++) {
            if(n % i == 0)
                result = false;
        }
        return result;
    }
}