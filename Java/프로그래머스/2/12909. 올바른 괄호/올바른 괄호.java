import java.util.*;
class Solution {
    boolean solution(String s) {
        boolean answer = true;
        Stack<Character> stack = new Stack<>();
        char ch[] = s.toCharArray();
        int i = 0;
        while(i < ch.length) {
            if(ch[i] == '(') {
                stack.push(ch[i]);
                
            }
            else {
        		if(stack.isEmpty()) {
                    answer = false;
                    break;
                }
                stack.pop();
                
            }
           i++; 
        }
        if(stack.size() != 0)
            answer = false;
        

        return answer;
    }
}