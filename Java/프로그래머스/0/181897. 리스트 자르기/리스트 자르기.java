class Solution {
    public int[] solution(int n, int[] slicer, int[] num_list) {
        int[] answer = {};
        int a = 0;
        if(n == 1) {
            answer = new int[slicer[1]+1];
			for(int i = 0; i <= slicer[1]; i++) {
                answer[a] = num_list[i];
                a++;
            }
        }
        else if(n == 2) {
            answer = new int[num_list.length-slicer[0]];
            for(int i = slicer[0]; i < num_list.length; i++) {
                answer[a] = num_list[i];
                a++;
            }
        }
        else if(n == 3) {
            answer = new int[slicer[1] - slicer[0] + 1];
            for(int i = slicer[0]; i <= slicer[1]; i++) {
                answer[a] = num_list[i];
                a++;
            }
        }
        else {
           
            answer = new int[(slicer[1] - slicer[0] + 1) / slicer[2] + (slicer[1] - slicer[0] + 1) % slicer[2]];
            for(int i = slicer[0]; i <= slicer[1]; i+= slicer[2]) {
                
                answer[a] = num_list[i];
                a++;
            }
        }
        return answer;
    }
}