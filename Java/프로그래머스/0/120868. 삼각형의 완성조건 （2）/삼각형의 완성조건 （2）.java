class Solution {
    public int solution(int[] sides) {
        int answer = 0;
       	int max = 0;
        int min = 10000;
        int cnt = 0;
        int m = sides[0] + sides[1];
        for(int i = 0; i < sides.length; i++) {
            if(max < sides[i])
                max = sides[i];
            if(min > sides[i])
                min = sides[i];
        }
        
        for(int i = max - min; i < max; i++) {
            cnt++;
        }
        for(int i = max+1; i < m; i++) {
            cnt++;
        }
        answer = cnt;
        
        return answer;
    }
}