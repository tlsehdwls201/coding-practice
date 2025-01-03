class Solution {
    public int solution(int n, int m, int[] section) {
        int answer = 0;
        int arr[] = new int[n+1];
        for(int i = 0; i < section.length; i++) {
            arr[section[i]] = 1;
        }
        int count = 0;
        for(int i = 1; i < arr.length; i++) {
            if(arr[i] != 0) {
                for(int j = i; j < i+m; j++) {
                    if(j > n) break;
                    arr[j] = 0;
                    
                }
                count++;
            }
        }
        answer = count;
        return answer;
    }
}