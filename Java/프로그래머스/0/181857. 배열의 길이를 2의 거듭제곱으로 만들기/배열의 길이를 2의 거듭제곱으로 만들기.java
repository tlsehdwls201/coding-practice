import java.util.*;
class Solution {
    public int[] solution(int[] arr) {
        int[] answer = {};
        List<Integer> l = new ArrayList<>();
        for(int i = 1; i <= 1024; i*=2) {
            l.add(i);
        }
        Vector v = new Vector();
        for(int i = 0; i < arr.length; i++) {
            v.add(arr[i]);
        }
        
        
        while(!l.contains(v.size())) {
            v.add(0);
        }
        answer = new int[v.size()];
        for(int i = 0; i < v.size(); i++) {
            answer[i] = (int)v.get(i);
        }
        return answer;
    }
}