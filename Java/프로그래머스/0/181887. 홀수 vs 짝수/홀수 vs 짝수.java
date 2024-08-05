class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int m1 = 0;
        int m2 = 0;
        for(int i = 0; i < num_list.length; i++) {
			if(i % 2 == 0)
                m1 += num_list[i];
            else
                m2 += num_list[i];
                
        }
        if(m1 > m2)
            answer = m1;
        else
            answer = m2;
        return answer;
    }
}