import java.util.*;

public class Solution {
    public String solution(String X, String Y) {
        // 두 숫자의 빈도를 저장할 배열 (0~9)
        int[] countX = new int[10];
        int[] countY = new int[10];

        // X의 숫자 빈도 계산
        for (char c : X.toCharArray()) {
            countX[c - '0']++;
        }

        // Y의 숫자 빈도 계산
        for (char c : Y.toCharArray()) {
            countY[c - '0']++;
        }

        // 공통 숫자를 저장할 StringBuilder
        StringBuilder result = new StringBuilder();

        // 9부터 0까지 숫자를 내림차순으로 처리
        for (int i = 9; i >= 0; i--) {
            // 두 문자열에서 공통으로 존재하는 최소 빈도만큼 추가
            int count = Math.min(countX[i], countY[i]);
            for (int j = 0; j < count; j++) {
                result.append(i);
            }
        }

        // 결과 문자열이 비어 있으면 공통 숫자가 없다는 의미
        if (result.length() == 0) {
            return "-1";
        }

        // 결과가 모두 0이면 "0" 반환
        if (result.charAt(0) == '0') {
            return "0";
        }

        return result.toString();
    }
}