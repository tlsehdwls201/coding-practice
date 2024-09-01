class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        for(int l = i; l <= j; l++) {
            String str[] = Integer.toString(l).split("");
            for(int x = 0; x < str.length; x++) {
                if(str[x].equals(Integer.toString(k))) {
                    answer++;
                }
            }
        }
        return answer;
    }
}