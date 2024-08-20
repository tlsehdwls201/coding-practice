class Solution {
    public int solution(int[][] dots) {
        int answer = 0;
        int x = 0;
        int y = 0;
        for(int i = 0; i < dots.length; i++) {
            for(int j = i; j < dots.length; j++) {
                if(i == j) continue;
                
                if(dots[i][0] == dots[j][0]) {
                  	 y = Math.abs(dots[j][1] - dots[i][1]);
                    break;
                }
                else if(dots[i][1] == dots[j][1]) {
                    x = Math.abs(dots[j][0] - dots[i][0]);
                    break;
                }
            }
        }
        answer = x * y;
        return answer;
    }
}