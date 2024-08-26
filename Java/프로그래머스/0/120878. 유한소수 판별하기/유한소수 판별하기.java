class Solution {
    int c = 1;
    public int solution(int a, int b) {
        int answer = 1;
        int f = you(a, b);
        int x = a / f;
        int y = b / f; 
        if((int)((x * Math.pow(10, c+1)) % y) != 0)
            answer = 2;
        return answer;
    }
    int you(int i, int j) {
        
        while(j != 0) {
            int r = i % j;
            i = j;
            j = r;
            c++;
        }
        return i;
    }
}