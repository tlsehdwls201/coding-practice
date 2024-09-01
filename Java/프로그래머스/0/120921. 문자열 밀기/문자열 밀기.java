class Solution {
    public int solution(String A, String B) {
        int answer = 0;
        int count = 0;
        String str[] = A.split("");
        String arr[] = new String[str.length];
        
        if(A.equals(B)) {
            answer = 0;
        }
        else {
            while(true) {
                arr[0] = str[str.length-1];
        		for(int i = 1; i < str.length; i++) {
                    arr[i] = str[i-1];
                }
                String s= "";
                for(int i = 0; i < str.length; i++) {
                    s += arr[i];
                }
                if(s.equals(B)) {
                    count++;
                    break;
                }
                else {
                    if(count == str.length) {
                        count = -1;
                        break;
                    }
                    count++;
                    for(int i = 0; i < arr.length; i++) {
                        str[i] = arr[i];
                    }
                }
            }
        }
        answer = count;
        return answer;
    }
}