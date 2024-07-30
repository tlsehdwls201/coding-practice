class Solution {
    public int solution(int[] common) {
        int answer = 0;
        int d_cha = common[1] - common[0];
        int d_b = 0;
        if(common[0] == 0) {
            d_b = d_cha;
    	}
        else
            d_b = common[1] / common[0];
        
        for(int i = 1; i < common.length; i++) {
            if(common[i] - common[i-1] == d_cha)
                answer = d_cha + common[common.length-1];
            else
                answer = d_b * common[common.length-1];
        }
        return answer;
    }
}