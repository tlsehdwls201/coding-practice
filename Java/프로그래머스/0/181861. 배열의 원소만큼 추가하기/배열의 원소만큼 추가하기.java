import java.util.*;
class Solution {
    public int[] solution(int[] arr) {
        int[] answer = {};
        List<Integer> l = new ArrayList<>();
        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr[i]; j++) {
                l.add(arr[i]);
            }
        }
        answer = new int[l.size()];
        for(int i = 0; i < l.size(); i++) {
            answer[i] = (int)l.get(i);
        }
        return answer;
    }
}