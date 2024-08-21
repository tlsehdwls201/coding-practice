class Solution {
    public String solution(String polynomial) {
        String answer = "";
        String str[] = polynomial.split(" ");
        int x = 0;
        int n = 0;
        for(int i = 0; i < str.length; i++) {
            if(str[i].contains("x")) {
                String s = str[i].replace("x", "");
                if(s.length() == 0)
                    x++;
                else
                    x += Integer.parseInt(s);
            }
            else if(!str[i].equals("+")) {
                n += Integer.parseInt(str[i]);
            }
        }
       
        
            if(x == 1) {
                answer = "x";
            }
            else
            	answer = x + "x";
    	
        if(n != 0) {
            if(x == 0)
                answer = "" + n;
        	else
            	answer += " + " + n;
        }
        return answer;
    }
}