class Solution {
    public int solution(String[][] board, int h, int w) {
        int answer = 0;
        int []h_index = {0,1,-1,0};
        int []w_index = {1,0,0,-1};
        for(int i = 0; i < h_index.length; i++) {
            if(h + h_index[i]< 0 || h + h_index[i] >= board.length || w + w_index[i] < 0 || w + w_index[i] >=board[0].length) continue;
            else if(board[h][w].equals(board[h+h_index[i]][w+w_index[i]])) {
                answer++;
            }
            else
                continue;
        }
        return answer;
    }
}