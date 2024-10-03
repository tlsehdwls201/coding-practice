import java.math.*;
class Solution {
    public String solution(String a, String b) {
        String answer = "";
        BigInteger bb = new BigInteger(a);
        BigInteger aa = new BigInteger(b);
        BigInteger result = bb.add(aa);
        answer = result.toString();
        return answer;
    }
}