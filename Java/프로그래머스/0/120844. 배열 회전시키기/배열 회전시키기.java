class Solution {
    public int[] solution(int[] numbers, String direction) {
        int[] answer = {};
        for(int i = 0; i < numbers.length-1; i++) {
            if(direction.equals("right")) {
               int temp = numbers[i];
               numbers[i] = numbers[numbers.length-1];
               numbers[numbers.length-1] = temp;
            }
            else {
                int temp = numbers[i+1];
                numbers[i+1] = numbers[i];
                numbers[i] = temp;
            }
        }
        answer = new int[numbers.length];
        for(int i = 0; i < answer.length; i++) {
            answer[i] = numbers[i];
        }
        return answer;
    }
}