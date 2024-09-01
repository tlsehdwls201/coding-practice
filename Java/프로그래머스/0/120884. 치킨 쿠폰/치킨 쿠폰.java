class Solution {
    public int solution(int chicken) {
        int answer = 0;
        int bonus = 0;
        int coupon = 0;
        while(chicken >= 1) {
            bonus = chicken / 10;
            coupon += chicken % 10;
            chicken /= 10;
            if(coupon / 10 >= 1) {
                bonus += coupon / 10;
               	coupon %= 10;
                coupon++;
            }
            answer += bonus;
            bonus = 0;
        }
        
        return answer;
    }
}