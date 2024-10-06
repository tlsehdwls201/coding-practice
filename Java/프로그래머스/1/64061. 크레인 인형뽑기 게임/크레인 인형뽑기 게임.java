import java.util.*;
class Solution {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        List<Integer> l = new ArrayList<>();
        for(int i = 0; i < moves.length; i++) {
            for(int j = 0; j < board.length; j++) {
                if(board[j][moves[i]-1] != 0) {
					l.add(board[j][moves[i]-1]);
                    board[j][moves[i]-1] = 0;
                    break;
                }
            }
        }
        
        for(int i = 0; i < l.size(); i++) {
            if(i != l.size()-1) {
                if(l.get(i) == l.get(i+1)) {
                    l.remove(i);
                    l.remove(i+1);
                    answer++;
                    i--;
                }
            }
        }
        return answer;
    }
}