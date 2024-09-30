import java.util.*;
class Solution {
    public int[] solution(int[] arr, int k) {
        int[] answer = {};
        //Arrays.sort(arr);
        List<Integer> l = new ArrayList<>();
        for(int i = 0; i < arr.length; i++) {
            if(l.size() == 0) {
                l.add(arr[i]);
            }
            else if(!l.contains(arr[i])) {
                l.add(arr[i]);
            }
            else {
                continue;
            }
            
            if(l.size() == k) break;
            
        }
        if(l.size() != k) {
            for(int i = l.size(); i < k; i++) {
                l.add(-1);
            }
        } 
        answer = new int[l.size()];
        for(int i = 0; i < answer.length; i++) {
            answer[i] = (int)l.get(i);
        }
        return answer;
    }
}