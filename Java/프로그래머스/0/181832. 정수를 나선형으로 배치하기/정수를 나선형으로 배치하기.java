class Solution {
    public int[][] solution(int n) {
        int[][] answer = new int[n][n];
        answer = rotate(answer, n);
        
        return answer;
    }
    int [][]rotate(int[][] arr, int n) {
        int a = 1;
        int x = 0;
        int x_m = n-1;
        int y = 0;
        int y_m = n-1;
        while(x <= x_m && y <= y_m) {
            
            for(int i = y; i <= y_m; i++) {
                arr[x][i] = a++;
            }
			x++;
            for(int i = x; i <= x_m; i++) {
                arr[i][y_m] = a++;
            }
            y_m--;
            if(x <= x_m) {
                for(int i = y_m; i >= y; i--) {
                    arr[x_m][i] = a++;
                }
                x_m--;
            }
            
            if(y <= y_m) {
                for(int i = x_m; i >= x; i--) {
                    arr[i][y] = a++;
                }
                y++;
            }
           
    }
        return arr;
}
    
}