class Solution {
    public int solution(int[][] dots) {
        int answer = 0;
        if(function(dots[0], dots[1]) == function(dots[2], dots[3]))
            answer = 1;
        else if(function(dots[0], dots[2]) == function(dots[1], dots[3]))
            answer = 1;
        else if(function(dots[0], dots[3]) == function(dots[1], dots[2]))
            answer = 1;
        return answer;
    }
    double function(int[] dot1, int[] dot2) {
        return (double)(dot2[1] - dot1[1]) / (dot2[0] - dot1[0]);
    }
}