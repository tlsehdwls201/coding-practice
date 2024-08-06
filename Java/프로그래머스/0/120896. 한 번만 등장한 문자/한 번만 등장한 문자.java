import java.util.*;
class Solution {
    public String solution(String s) {
        String answer = "";
        String str[] = s.split("");
        Map<String, Integer> m = new HashMap<>();
        for(int i = 1; i <= str.length; i++) {
            m.put(str[i-1], m.getOrDefault(str[i-1],0) + 1);
        }
        String arr = "";
        int a = 0;
        for(int i = 0; i < str.length; i++) {
            if(m.get(str[i]) == 1)
                arr += str[i];
        }
        String arr_a[] = arr.split("");
        Arrays.sort(arr_a);
        for(int i = 0; i < arr_a.length; i++) {
            answer += arr_a[i];
        }
        
        return answer;
    }
}