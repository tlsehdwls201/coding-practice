import java.util.*;
class Solution {
    public int[][] solution(int[][] arr) {
        int[][] answer = {};
        List<List<Integer>> l = new ArrayList<>();
        if(arr.length > arr[0].length)
            for(int i = 0; i < arr.length; i++) {
                l.add(new ArrayList<>());
            }
        else
            for(int i = 0; i < arr[0].length; i++) {
                l.add(new ArrayList<>());
            }
        
        for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
                l.get(i).add(arr[i][j]);
            }
        }
       if(arr.length > arr[0].length) {
           for(int i = 0; i < arr.length; i++) {
               for(int j = 0; j < arr.length-arr[0].length; j++) 
               		l.get(i).add(0);
           }
           answer = new int[l.size()][l.get(0).size()];
           for(int i = 0; i < answer.length; i++) {
               for(int j = 0; j < answer[i].length; j++) {
                   answer[i][j] = (int)l.get(i).get(j);
               }
           }
           
       }
       else if(arr.length < arr[0].length) {
           for(int i = arr.length; i < arr[0].length; i++) {
               for(int j = 0; j < arr[0].length; j++)
                   l.get(i).add(0);
           }
           answer = new int[l.size()][l.get(0).size()];
           for(int i = 0; i < answer.length; i++) {
               for(int j = 0; j < answer[i].length; j++) {
                   answer[i][j] = (int)l.get(i).get(j);
               }
           }
          
           
       }
       else {
			answer = new int[l.size()][l.get(0).size()];
           for(int i = 0; i < answer.length; i++) {
               for(int j = 0; j < answer[i].length; j++) {
                   answer[i][j] = (int)l.get(i).get(j);
               }
           }
       }
        return answer;
        
    }
}