class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = {0,0};
        
        int h = 0;
        int v = 0;
        
        int i = 0;
        while(true) {
            if(h*v-yellow == brown)
                break;
            h = brown / 2 - i;
            v = 2 + i;
            i++;
        }
        answer[0] = h;
        answer[1] = v;
        return answer;
    }
}