import java.util.*;
class Solution {
    public int[] solution(int[] answers) {
        int[] answer = {};
        String s1 = "12345".repeat(2000);
        String s2 = "21232425".repeat(1250);
        String s3 = "3311224455".repeat(1000);
        String str1[] = s1.split("");
        String str2[] = s2.split("");
        String str3[] = s3.split("");
        
        int count1 = 0;
        int count2 = 0;
        int count3 = 0;
        
        for(int i = 0; i < answers.length; i++) {
            if(str1[i].equals(Integer.toString(answers[i])))
                count1++;
            if(str2[i].equals(Integer.toString(answers[i])))
                count2++;
            if(str3[i].equals(Integer.toString(answers[i])))
                count3++;
        }
        

        
        if(count1 > count2 && count1 > count3) {
            answer = new int[1];
            answer[0] = 1;
        }
        else if(count2 > count1 && count2 > count3) {
            answer = new int[1];
            answer[0] = 2;
        }
        else if(count3 > count2 && count3 > count1) {
            answer = new int[1];
            answer[0] = 3;
        }
        else if(count1 == count2 && count2 > count3) {
            answer = new int[2];
            answer[0] = 1;
            answer[1] = 2;
        }
        else if(count2 == count3 && count3 > count1) {
            answer = new int[2];
            answer[0] = 2;
            answer[1] = 3;
        }
        else if(count1 == count3 && count3 > count2) {
            answer = new int[2];
            answer[0] = 1;
            answer[1] = 3;
        }
        else if(count1 == count2 && count2 == count3) {
            answer = new int[3];
            answer[0] = 1;
            answer[1] = 2;
            answer[2] = 3;
        }
        return answer;
    }
}