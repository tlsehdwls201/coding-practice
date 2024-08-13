import java.util.*;
class Solution {
    public int solution(String dartResult) {
        int answer = 0;
        String d = "";
       	List<Integer> v = new LinkedList<>();
       
        int sum = 0;
        String ch[] = dartResult.split("");
        for(int i = 0; i < ch.length; i++) {
            if(Character.isDigit(ch[i].charAt(0))) {
                if(Character.isDigit(ch[i].charAt(0)) && Character.isDigit(ch[i+1].charAt(0)))	{
                    d = ch[i] + ch[i+1];
                	i++; 
           	}
                else
                	d = ch[i];
                	 
            }
          
            //System.out.println(d);
            if(ch[i].equals("S")) {
                v.add(Integer.parseInt(d));
                
            }
            
        	else if(ch[i].equals("D")) {
                v.add(Integer.parseInt(d) * Integer.parseInt(d));
                
                
            }
            else if(ch[i].equals("T")) {
                v.add(Integer.parseInt(d)*Integer.parseInt(d)*Integer.parseInt(d));
                
                
            }
            else if(ch[i].equals("*")) {
               	if(v.size() == 1) {
                	v.add(v.get(v.size()-1) * 2);
               		v.remove((v.size()-2));
                    }
                else {
                    v.add(v.get(v.size()-2) * 2);
                    v.add(v.get(v.size()-2) * 2);
                    v.remove((v.size()-3));
                    v.remove((v.size()-3));
                    
                }
            }
            else if(ch[i].equals("#")){
               
                v.add(v.get(v.size()-1) * -1);
                v.remove((v.size()-2));
               
            }
         // System.out.println(sum);
        }
        for(int i = 0; i < v.size(); i++) {
            answer += (int)v.get(i);
            System.out.println((int)v.get(i));
        }
        //answer = sum;
        return answer;
    }
}