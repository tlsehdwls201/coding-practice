class Solution {
    public int solution(String[] order) {
        int answer = 0;
        String s1 = "americano";
        String s2 = "cafelatte";
        int sb1 = 4500;
        int sb2 = 5000;
        for(int i = 0; i < order.length; i++) {
            if(order[i].contains(s1)) {
                answer += sb1;
            }
            if(order[i].equals("anything")) {
                answer += sb1;
            }
            if(order[i].contains(s2)) {
                answer += sb2;
            }
        }
        return answer;
    }
}