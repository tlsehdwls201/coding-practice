class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        for(int i = 0; i < nums.length; i++) {
            for(int j = i+1; j < nums.length; j++) {
                for(int l = j+1; l < nums.length; l++) {
                    int sum = nums[i] + nums[j] + nums[l];
                    int count = 0;
                    for(int x = 1; x <= sum; x++) {
                        if(sum % x == 0)
                            count++;
                    }
                    if(count == 2)
                        answer++;
                 
                        
                }
            }
        }
        return answer;
    }
}