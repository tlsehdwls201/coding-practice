import java.util.*;
class Solution {
    public String solution(String s) {
        String answer = "";
        char ch[] = s.toCharArray();
        int arr[] = new int[ch.length];
        for(int i = 0; i < ch.length; i++) {
            arr[i] = (int)ch[i];
           
        }
        Arrays.sort(arr);
        for(int i = arr.length-1; i >= 0; i--) {
            answer += (char)arr[i];
        }
       
        return answer;
    }
}