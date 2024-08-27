import java.util.*;
class Solution {
    public double[] solution(int[][] score) {
        double[] answer = new double[score.length];
        List<Double> l = new ArrayList<>();
        for(int i = 0; i < score.length; i++) {
            double avg = ((double)(score[i][0] + score[i][1]) / 2);
            answer[i] = avg;
            l.add(avg);
        }
        System.out.println(l);
        Map<Double, Double> m = new HashMap<>();
        Collections.sort(l);
        double rank = score.length;
        for(int i = 0; i < l.size(); i++) {
            
            	m.put(l.get(i), rank--);
        }
        
        for(int i = 0; i < answer.length; i++) {
            answer[i] = m.get(answer[i]);
        }
        return answer;
    }
}