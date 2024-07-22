class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        // 조카가 발음할 수 있는 4가지
        String speak[] = {"aya", "ye", "woo", "ma"};
        int ans = 0;
        int result = 0;
        for(int i = 0; i < babbling.length; i++) {
            ans = 0;
            for(int j = 0; j < speak.length; j++) {
                if(babbling[i].contains(speak[j])) {
                    ans -= speak[j].length();
                    if(babbling[i].length() + ans == 0) {
                   		result+=1;
                   		break;
                    }
                }
            }
       	 }
       
        answer  = result;
        return answer;
    }
}