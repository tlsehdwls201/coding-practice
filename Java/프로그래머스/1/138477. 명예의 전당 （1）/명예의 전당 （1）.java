import java.util.*;
class Solution {
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        int[] arr = new int[k];
       	int min = 10000;
        for(int i = 1; i <= answer.length; i++) {
            for(int j = 0; j < arr.length; j++) {
                if(i > k) {
                    if(min < score[i-1]) {
                        arr[j] = score[i-1];
                        Arrays.sort(arr);
                        min = arr[0];
                        answer[i-1] = min;
                        
                        break;
                    }
                    else {
                        answer[i-1] = min;
                        break;
                    }
                }
                else {
                    arr[j] = score[i-1];
                    if(arr[j] < min)
                        min = arr[j];
                    Arrays.sort(arr);
                    answer[i-1] = min;
                    System.out.println(Arrays.toString(arr));
                    break;
                }
                
            }
        }
        return answer;
    }
}