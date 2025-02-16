import java.util.*;

class Solution {
    static int[][][] dp; // 메모이제이션 (DP 테이블)
    static int minA = Integer.MAX_VALUE;
    static int n, m, len;
    
    public int solution(int[][] info, int N, int M) {
        n = N;
        m = M;
        len = info.length;
        
        // DP 테이블 초기화 (-1: 아직 계산되지 않은 상태)
        dp = new int[len][n + 1][m + 1];
        for (int[][] arr : dp) {
            for (int[] row : arr) {
                Arrays.fill(row, -1);
            }
        }

        int result = dfs(info, 0, 0, 0);
        return (result == Integer.MAX_VALUE) ? -1 : result;
    }

    private int dfs(int[][] info, int idx, int sumA, int sumB) {
        // 경찰에 걸리는 경우 탐색 중단
        if (sumA >= n || sumB >= m) return Integer.MAX_VALUE;

        // 모든 물건을 선택한 경우 최소값 반환
        if (idx == len) return sumA;

        // 이미 방문한 상태라면 저장된 값을 사용 (메모이제이션)
        if (dp[idx][sumA][sumB] != -1) return dp[idx][sumA][sumB];

        // A도둑이 선택하는 경우
        int pickA = dfs(info, idx + 1, sumA + info[idx][0], sumB);

        // B도둑이 선택하는 경우
        int pickB = dfs(info, idx + 1, sumA, sumB + info[idx][1]);

        // 최소값 갱신 후 DP 테이블에 저장
        dp[idx][sumA][sumB] = Math.min(pickA, pickB);
        return dp[idx][sumA][sumB];
    }
}
