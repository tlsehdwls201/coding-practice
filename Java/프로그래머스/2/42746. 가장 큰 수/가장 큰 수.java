import java.util.*;
class Solution {
    public String solution(int[] numbers) {
        String answer = "";
        String str[] = new String[numbers.length];
        for(int i = 0; i < str.length; i++) {
            str[i] = Integer.toString(numbers[i]).repeat(3);
            //System.out.println(str[i]);
        }
        Arrays.sort(str, Collections.reverseOrder());
       	for(int i = 0; i < str.length; i++) {
            answer += str[i].substring(0,str[i].length()/3);
        }
        //System.out.println(Arrays.toString(str));
        if(answer.equals("0".repeat(str.length)))
            answer = "0";
        return answer;
    }
}