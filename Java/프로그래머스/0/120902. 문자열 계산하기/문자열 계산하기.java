class Solution {
    public int solution(String my_string) {
        int answer = 0;
        String str[] = my_string.split(" ");
            answer = Integer.parseInt(str[0]);
        for(int i = 1; i < str.length; i++) {
            if(str[i].equals("+"))
                answer += Integer.parseInt(str[++i]);
            if(str[i].equals("-"))
                answer -= Integer.parseInt(str[++i]);
        }
        return answer;
    }
}