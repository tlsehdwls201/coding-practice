import java.util.*;
class Solution {
    public int solution(int k, int m, int[] score) {
        int answer = 0;
        if(score.length < m)
            answer = 0;
        else {
            int min = 10;
            int arr[][] = new int[score.length/m][m];
            Arrays.sort(score);
            int a = 0;
			for(int i = 0; i < arr.length; i++) {
                for(int j = 0; j < arr[i].length; j++) {
                	arr[i][j] = score[score.length-1-a++];
                  
                }
                
                for(int j = 0; j < arr[i].length; j++) {
                    if(arr[i][j] < min)
                        min = arr[i][j];
                }
                answer += min * m;
                
            }
            
            
            
        }
        return answer;
    }
}