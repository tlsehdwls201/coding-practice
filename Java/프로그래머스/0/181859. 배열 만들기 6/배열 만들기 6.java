import java.util.*;
class Solution {
    public int[] solution(int[] arr) {
        int[] answer = {};
        Vector v = new Vector();
        for(int i = 0; i < arr.length; i++) {
            if(v.size() == 0)
                v.add(arr[i]);
            else if((int)v.get(v.size()-1) == arr[i]) {
                v.remove(v.size()-1);
            }
            else {
                v.add(arr[i]);
            }
        }
        answer = new int[v.size()];
        if(v.size() == 0) {
            answer = new int[1];
            answer[0] = -1;
        }
        else {
            for(int i = 0; i < answer.length; i++) {
                answer[i] = (int)v.get(i);
            }
        }
        return answer;
    }
}