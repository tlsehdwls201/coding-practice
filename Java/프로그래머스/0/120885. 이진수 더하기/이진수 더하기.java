class Solution {
    public String solution(String bin1, String bin2) {
        String answer = "";
        int a = Integer.parseInt(bin1, 2);
        int b = Integer.parseInt(bin2, 2);
        int num = a + b;
        answer = Integer.toBinaryString(num);
        return answer;
    }
}