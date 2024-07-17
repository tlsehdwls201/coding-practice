import java.util.*;
class Solution {
    public int[] solution(int[] arr, int divisor) {
        int[] answer = {};
        Arrays.sort(arr);
        Vector v = new Vector();
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] % divisor == 0)
                v.add(arr[i]);
            
        }
        if(v.size() == 0)
            v.add(-1);
        
        answer = new int[v.size()];
        for(int i = 0; i < answer.length; i++) {
            answer[i] = (int)v.get(i);
        }
        return answer;
    }
}