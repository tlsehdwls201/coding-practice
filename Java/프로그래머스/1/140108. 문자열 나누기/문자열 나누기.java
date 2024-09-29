class Solution {
    public int solution(String s) {
        int answer = 0;
        int x_cnt = 0;
        int not_cnt = 0;
        String ss = "";
        String r = "";
        int a = 0;
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) != s.charAt(a)) {
                not_cnt++;
                if(not_cnt == x_cnt) {
                    for(int j = a; j <= i; j++) {
                        r += s.charAt(j);
                        ss += s.charAt(j);
                    }
                    
                    r += " ";
                    a+= not_cnt + x_cnt;
                    
                    not_cnt = 0;
                    x_cnt = 0;
                }
            }
            else if(s.charAt(i) == s.charAt(a)) {
                x_cnt++;
                
            }
            
            
        }
		s = s.replace(ss, r);
        System.out.println(s);
        String str[] = s.split(" ");
        answer = str.length;
        return answer;
    }
}