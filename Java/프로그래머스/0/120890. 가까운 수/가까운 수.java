import java.util.*;
class Solution {
    public int solution(int[] array, int n) {
        int answer = 0;
        int min = 101;
        int a = 101;
        for(int i = 0; i < array.length; i++) {
            if(Math.abs(n-array[i]) < min){
                min = Math.abs(n-array[i]);
                answer = array[i];
            }
            if(min == Math.abs(n-array[i])) {
                if(n > array[i]) {
                    answer = array[i];
                }
            }
        }
        return answer;
    }
}