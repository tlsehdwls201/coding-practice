class Solution {
    public String solution(String s) {
       
        String a = "";
        int e=0;
        for(int i= 0;i<s.length();i++ ) {    
            if(s.charAt(i)==' ') {
                a+=" ";
                e=0;
            }else if(e%2==0) {
                a+= Character.toUpperCase(s.charAt(i));
                e++;
            }else {
                a+= Character.toLowerCase(s.charAt(i));
                e++;
            }
        }
        return a;
    }
}