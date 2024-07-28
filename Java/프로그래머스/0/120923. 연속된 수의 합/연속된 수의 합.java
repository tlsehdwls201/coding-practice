import java.util.*;
class Solution {
    public int[] solution(int num, int total) {
        int[] answer = new int[num];
        int n = total / num;
        int d = num / 2;
        for(int i = 0; i < num; i++) {
            answer[i] = n + d - i;
        }
        Arrays.sort(answer);
        return answer;
    }
}