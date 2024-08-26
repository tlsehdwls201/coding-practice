class Solution {
    int c = 1;
    public int solution(int a, int b) {
        int answer = 2;
        int f = you(a, b);
        int x = a / f;
        int y = b / f;
        int count = 0;
        if(!(y % 2 == 0 || y % 5 == 0 || y == 1))
            answer = 2;
        if((int)((x * Math.pow(10, c+1)) % y) == 0)
       		answer = 1;
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