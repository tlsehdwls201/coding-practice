import java.util.*;
class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        Map<Integer, Integer> m = new HashMap<>();
        for(int i = 0; i < nums.length; i++) {
            m.put(nums[i], m.getOrDefault(nums[i],0) + 1);
        }
        if(nums.length /2 < m.size())
       		answer = nums.length / 2;
        else
            answer = m.size();
        return answer;
    }
}