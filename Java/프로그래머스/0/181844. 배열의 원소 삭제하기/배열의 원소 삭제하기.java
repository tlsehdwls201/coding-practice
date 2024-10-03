import java.util.*;
class Solution {
    public int[] solution(int[] arr, int[] delete_list) {
        int[] answer = {};
        List<Integer> l = new ArrayList<>();
        List<Integer> al = new ArrayList<>();
        for(int i = 0; i < delete_list.length; i++) {
            l.add(delete_list[i]);
        }
        
        for(int i = 0; i < arr.length; i++) {
            if(l.contains(arr[i])) continue;
            	al.add(arr[i]);
        }
        answer = new int[al.size()];
        for(int i = 0; i < answer.length; i++) {
            answer[i] = (int)al.get(i);
        }
        return answer;
    }
}