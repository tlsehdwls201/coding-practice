import java.util.*;
class Solution {
    public int[] solution(int n) {
        int[] answer = {};
        Vector v = new Vector();
        Vector v2 = new Vector();
        // 에라토스테네스의 체
        int arr[] = new int[n + 1];
        arr[0] = 0;
        arr[1] = 1;
        for(int i = 2; i <= n; i++) {
            arr[i] = i;
        }
        
        for(int i = 2; i <= Math.sqrt(n); i++) {
            if(arr[i] == 0) continue;
            for(int j = i+i; j <= n; j+=i) {
                arr[j] = 0;
            }
        }
        for(int i = 2; i <= n; i++) {
            if(arr[i] != 0) {
                v.add(arr[i]);
            }
        }
      	
        for(int i = 0; i < v.size(); i++) {
			if(n % (int)v.get(i) == 0)
                v2.add(v.get(i));
        }
        answer = new int[v2.size()];
        
        for(int i = 0; i < v2.size(); i++) {
            answer[i] = (int)v2.get(i);
        }
        return answer;
    }
}