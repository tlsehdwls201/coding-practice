class Solution {
    public int[] solution(String[] park, String[] routes) {
        int[] answer = {0,0};
        
        String s = "";
        for(int i = 0; i < park.length; i++) {
            s += park[i];
        }
        
        char ch[] = s.toCharArray();
        char p_2[][] = new char[park.length][park[0].length()];
        
        int o = 0;
        
        int a = 0;
        int b = 0;
        
        for(int i = 0; i < p_2.length; i++) {
            for(int j = 0; j < p_2[i].length; j++) {
                p_2[i][j] = ch[o++];
                if(p_2[i][j] == 'S') {
                    a = i;
                    b = j;
                }
                
            }
        }
          for(int i = 0; i < p_2.length; i++) {
            for(int j = 0; j < p_2[i].length; j++) {
                System.out.print(p_2[i][j]);
            }
            System.out.println();
        } 
        
        int c = a;
        int d = b;
        
        
        
        for(int j = 0; j < routes.length; j++) {
            String ss[] = routes[j].split(" ");
            if(ss[0].equals("E")) {
               // c += 0;
                d += Integer.parseInt(ss[1]);
                if(d >= p_2[0].length) {
                    d -= Integer.parseInt(ss[1]);
                    continue;
                }
                else if(d < p_2[0].length) {
                    for(int i = d; i > d-Integer.parseInt(ss[1]); i--) {
                        if(p_2[c][i] == 'X') {
                            d -= Integer.parseInt(ss[1]);
                            break;
                        }
                    }
                }
            }
            
            if(ss[0].equals("S")) {
                c += Integer.parseInt(ss[1]);
               // d += 0;
                if(c >= p_2.length) {
                    c -= Integer.parseInt(ss[1]);
                    continue;
                }
                else if(c < p_2.length) {
                    for(int i = c; i > c-Integer.parseInt(ss[1]); i--) {
                        if(p_2[i][d] == 'X') {
                            c -= Integer.parseInt(ss[1]);
                            break;
                        }
                    }
                }
            }
            if(ss[0].equals("N")) {
                c -= Integer.parseInt(ss[1]);
               // d -= 0;
                if(c < 0) {
                    c += Integer.parseInt(ss[1]);
                    continue;
                }
                else if(c >= 0) {
                    for(int i = c; i < c+Integer.parseInt(ss[1]); i++) {
                        if(p_2[i][d] == 'X') {
                            c += Integer.parseInt(ss[1]);
                            break;
                        }
                    }
                } 
            }
            if(ss[0].equals("W")) {
               // c -= 0;
                d -= Integer.parseInt(ss[1]);
                if(d < 0) {
              		d += Integer.parseInt(ss[1]);
                    continue;
                }
                
                else if(d >= 0) {
                    for(int i = d; i < d+Integer.parseInt(ss[1]); i++) {
                        if(p_2[c][i] == 'X') {
                            d += Integer.parseInt(ss[1]);
                            break;
                        }
                    }
                }
            }
            System.out.print(c);
            System.out.println(d);
        }
        answer[0] = c;
        answer[1] = d;
        
        return answer;
    }
}