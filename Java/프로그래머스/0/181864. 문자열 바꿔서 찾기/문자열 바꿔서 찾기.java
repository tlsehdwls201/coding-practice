class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        String str[] = myString.split("");
        myString = "";
        for(int i = 0; i < str.length; i++) {
            if(str[i].equals("A"))
                myString += "B";
            else
                myString += "A";
        }
        if(myString.contains(pat))
            answer = 1;
        else answer = 0;
        
        return answer;
    }
}