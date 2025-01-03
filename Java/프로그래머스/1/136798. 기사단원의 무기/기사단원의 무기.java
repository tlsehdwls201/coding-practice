class Solution {
    public int solution(int number, int limit, int power) {
        int answer = 0;
        int arr[] = new int[number];
        for(int i = 1; i <= arr.length; i++) {
            int count = 0;
            for(int j = 1; j * j <= i; j++) {
                if(i % j == 0) {
                    count++;
                    if(j != i / j) count += 1;
                }
            }
            arr[i-1] = count;
            if(arr[i-1] > limit) {
                arr[i-1] = power;
            }
        }
        for(int i = 0; i < arr.length; i++) {
            answer += arr[i];
        }
        return answer;
    }

    
}
