class Solution {
    public int solution(String[] spell, String[] dic) {
        int answer = 0;
        int count = 0;
        int t = 0;
        for(int i = 0; i < dic.length; i++) {
            for(int j = 0; j < spell.length; j++) {
                if(dic[i].contains(spell[j])) {
                    count++;
                }
                if(count == spell.length)
                    t++;
            }
            count = 0;
        }
        if(t != 0)
        	return 1;
        else
            return 2;
    }
}