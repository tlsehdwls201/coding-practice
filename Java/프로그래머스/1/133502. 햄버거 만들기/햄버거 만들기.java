
class Solution {
    public int solution(int[] ingredient) {
        int answer = 0;
        int arr[] = new int[ingredient.length];
        int space = 0;
        for(int i : ingredient) {
            arr[space++] = i;
            if(space >= 4 && arr[space-1] == 1 && arr[space-2] == 3 && arr[space-3] == 2 && arr[space-4] == 1) {
                answer++;
                space-=4;
            }
          
            
        }
        return answer;
    }
}