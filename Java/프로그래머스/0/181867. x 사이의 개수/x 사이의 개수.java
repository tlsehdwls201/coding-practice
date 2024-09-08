import java.util.*;
class Solution {
    public int[] solution(String myString) {
        int[] answer = {};
       	String str[] = {};
        if(myString.charAt(myString.length()-1) == 'x')  {
            myString += "x ";
        
        	str = myString.split("x");
        
        
        	answer = new int[str.length-1];
        }
        else {
            str = myString.split("x");
            answer = new int[str.length];
        }
      
        for(int i = 0; i < answer.length; i++) {
            
            answer[i] = str[i].length();
        }
        return answer;
    }
}