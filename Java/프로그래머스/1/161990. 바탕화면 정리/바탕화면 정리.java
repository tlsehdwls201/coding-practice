import java.util.*;

class Solution {
    public int[] solution(String[] wallpaper) {
        int[] answer = {100000,1000000,0,0};
        
        String s = "";
        for(int i = 0; i < wallpaper.length; i++) {
			s += wallpaper[i];
        }
        
        char c[] = s.toCharArray();
        char ch[][] = new char[wallpaper.length][wallpaper[0].length()];

        int l = 0;
        
        int lux = 0;
        int luy = 0;
        int rdx = 0;
        int rdy = 0;
        
        for(int i = 0; i < wallpaper.length; i++) {
            for(int j = 0; j < wallpaper[i].length(); j++) {
                ch[i][j] = c[l++];
                
                if(ch[i][j] == '#') {
                    int a = i;
                    int b = j;
                    
                    answer[0] = Math.min(answer[0], a);
                    answer[1] = Math.min(answer[1], b);
                   	answer[2] = Math.max(answer[2], a+1);
                    answer[3] = Math.max(answer[3], b+1);
                }
            }
        }
        return answer;
    }
}