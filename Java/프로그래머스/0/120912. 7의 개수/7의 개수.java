class Solution {
    public int solution(int[] array) {
        int answer = 0;
        String s = "";
        for(int i = 0; i < array.length; i++) {
            s += Integer.toString(array[i]);
        }
        String str[] = s.split("");
        for(int i = 0; i < str.length; i++) {
            if(str[i].equals("7"))
                answer++;
        }
        return answer;
    }
}