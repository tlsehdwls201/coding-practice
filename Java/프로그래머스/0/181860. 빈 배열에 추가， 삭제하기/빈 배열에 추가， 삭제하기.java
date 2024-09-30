import java.util.*;
class Solution {
    public int[] solution(int[] arr, boolean[] flag) {
        int[] answer = {};
        List<Integer> l = new ArrayList<>();
        for(int i = 0; i < flag.length; i++) {
            if(flag[i]) {
                for(int j = 0; j < arr[i]*2; j++) {
                    l.add(arr[i]);
                }
            }
            else {
                for(int j = 0; j < arr[i]; j++) {
                    l.remove(l.size()-1);
                }
            }
                
        }
        answer = new int[l.size()];
        for(int i = 0; i < answer.length; i++) {
            answer[i] = (int)l.get(i);
        }
        return answer;
    }
}