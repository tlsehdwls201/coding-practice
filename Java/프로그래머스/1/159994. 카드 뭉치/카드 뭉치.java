class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        String answer = "";
        int i = 0;
        int j = 0;
        int a = 0;
        int count = 0;
        while(true) {
            if(cards1[i].equals(goal[a])) {
                count++;
                i++;
                if(i == cards1.length)
                    i -= 1;
            }
            else if(cards2[j].equals(goal[a])) {
                count++;
            	j++;
                if(j == cards2.length)
                    j-=1;
            }
            a++;
            if(a == goal.length)
                break;
            
        }
        if(count == goal.length)
            answer = "Yes";
        else
            answer = "No";
        return answer;
    }
}