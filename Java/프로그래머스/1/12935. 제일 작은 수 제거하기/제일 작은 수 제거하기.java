import java.util.*;
class Solution {
    public int[] solution(int[] arr) {
        int[] answer = {};
        List<Integer> l = new ArrayList<>();
        int min = arr[0];
        for(int i = 0; i < arr.length; i++) {
            if(min > arr[i])
                min = arr[i];
        }
        int a = min;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == a) continue;
            l.add(arr[i]);
        }
        if(l.size() == 0) {
            answer = new int[1];
            answer[0] = -1;
        }
        else {
            answer = new int[l.size()];
            for(int i = 0; i < l.size(); i++) {
                answer[i] = (int)l.get(i);
            }
        }
            
        return answer;
    }
}