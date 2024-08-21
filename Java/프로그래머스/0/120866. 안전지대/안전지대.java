import java.util.*;
class Solution {
    public int solution(int[][] board) {
        int answer = 0;
        int arr[][] = new int[board.length][board[0].length];
        for(int i = 0; i < board.length; i++) {
            for(int j = 0; j < board[i].length; j++) {
                arr[i][j] = board[i][j];
            }
        }
        
        for(int i = 0; i < board.length; i++) {
            for(int j = 0; j < board[i].length; j++) {
                if(board[i][j] == 1) {
                    if(i == 0 && j == 0) {
                        if(board.length == 1)
                            break;
                        else {
                            arr[i+1][j] = 1;
                            arr[i][j+1] = 1;
                            arr[i+1][j+1] = 1;
                        }
                    }
                    else if(i == 0 && j == board[i].length-1) {
                        arr[i+1][j-1] = 1;
                        arr[i+1][j] = 1;
                        arr[i][j-1] = 1;
                    }
                    else if(i == board.length-1 && j == 0) {
                        arr[i-1][j] = 1;
                        arr[i][j+1] = 1;
                        arr[i-1][j+1] = 1;
                    }
                    else if(i == board.length-1 && j == board[i].length-1) {
                        arr[i-1][j] = 1;
                        arr[i][j-1] = 1;
                        arr[i-1][j-1] = 1;
                    }
                    
                    else if(i == 0) {
                        arr[i][j-1] = 1;
                        arr[i][j+1] = 1;
                        arr[i+1][j] = 1;
                        arr[i+1][j-1] = 1;
                        arr[i+1][j+1] = 1;
                    }
                    else if(j == 0) {
                        arr[i-1][j] = 1;
                        arr[i+1][j] = 1;
                        arr[i][j+1] = 1;
                        arr[i-1][j+1] = 1;
                        arr[i+1][j+1] = 1;
                    }
                    else if(i == board.length-1) {
                        arr[i][j+1] = 1;
                        arr[i][j-1] = 1;
                        arr[i-1][j] = 1;
                        arr[i-1][j+1] = 1;
                        arr[i-1][j-1] = 1;
                    }
                    else if(j == board[i].length-1) {
                        arr[i+1][j] = 1;
                        arr[i-1][j] = 1;
                        arr[i][j-1] = 1;
                        arr[i+1][j-1] = 1;
                        arr[i-1][j-1] = 1;
                    }
                    else {
                        arr[i-1][j] = 1;
                        arr[i+1][j] = 1;
                        arr[i][j+1] = 1;
                        arr[i][j-1] = 1;
                        arr[i-1][j-1] = 1;
                        arr[i-1][j+1] = 1;
                        arr[i+1][j-1] = 1;
                        arr[i+1][j+1] = 1;
                    }
                }
                
            }
        }
        for(int i = 0; i < arr.length; i++) {
       		System.out.println(Arrays.toString(arr[i]));
        }
        for(int i = 0; i < board.length; i++) {
            for(int j = 0; j < board[i].length; j++) {
                if(arr[i][j] == 0)
                    answer++;
            }
        }
        
        return answer;
    }
}