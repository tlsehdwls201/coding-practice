import java.util.*;

class Solution {
    public String[] solution(String[] strings, int n) {
        // 배열을 정렬하면서 두 가지 기준 적용: n번째 문자, 그 다음은 사전순 정렬
        Arrays.sort(strings, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                // n번째 문자가 같은 경우, 전체 문자열을 사전순으로 정렬
                if (s1.charAt(n) == s2.charAt(n)) {
                    return s1.compareTo(s2);
                }
                // n번째 문자를 기준으로 정렬
                return Character.compare(s1.charAt(n), s2.charAt(n));
            }
        });
        return strings;
    }
}
