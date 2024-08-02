import java.util.*;
class Solution {
    public int[] solution(int[] arr) {
        int[] answer = {-1};
        String s = "";
        for(int i =0; i < arr.length; i++) {
            if(arr[i] == 10)
                s += Integer.toString(1);
            else
				s += Integer.toString(arr[i]);
        }
        
        System.out.println(s);
        int a = s.indexOf("2");
        int b = s.lastIndexOf("2");
       	
        answer = new int[b-a+1];
        int o = 0;
        for(int i = a; i <= b; i++) {
            if(i < 0) {
                answer[0] = -1;
                break;
            }
			answer[o] = arr[i];
            o++;
        }
        return answer;
    }
}