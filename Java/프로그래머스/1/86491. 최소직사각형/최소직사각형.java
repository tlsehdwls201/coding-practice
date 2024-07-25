import java.util.*;
class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;
        
        for(int i = 0; i < sizes.length; i++) {
            for(int j = 0; j < sizes[i].length-1; j++) {
                if(sizes[i][j+1] > sizes[i][j]) {
                	int temp = sizes[i][j];
                    sizes[i][j] = sizes[i][j+1];
                    sizes[i][j+1] = temp;
                }
            }
        }
      
        int max1 = 0;
        int max2 = 0;
        for(int i = 0; i < sizes.length; i++) {            
            if(max1 < sizes[i][0])
                max1 = sizes[i][0];
            if(sizes[i][1] > max2)
                max2 = sizes[i][1];            
        }
        answer = max1 * max2;
        return answer;
    }
}