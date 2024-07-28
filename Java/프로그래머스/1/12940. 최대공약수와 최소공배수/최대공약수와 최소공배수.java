class Solution {
    public int[] solution(int n, int m) {
        int[] answer = {0, 0};
        answer[0] = f(n, m);
        answer[1] = g(n, m);
        return answer;
    }
    int f(int a, int b) {
       
        while(b != 0) {
            int r  = a % b;
            a = b;
            b = r;
        }
        return a;
    }
    
    int g(int a, int b) {
        int i = a;
        int j = b;
        while(j != 0) {
            int r = i % j;
            i = j;
            j = r;
        }
        return i*(b/i)*(a/i);
    }
}