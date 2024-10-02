import java.util.*;
class Solution {
    public int solution(String[] strArr) {
        int answer = 0;
        Map<Integer, Integer> m = new HashMap<>();
        int max = 0;
        for(int i = 0; i < strArr.length; i++) {
            m.put(strArr[i].length(), m.getOrDefault(strArr[i].length(), 0) + 1);
            if(max < (int)m.get(strArr[i].length())) {
                max = (int)m.get(strArr[i].length());
            }
        }
        answer = max;
        return answer;
    }
}