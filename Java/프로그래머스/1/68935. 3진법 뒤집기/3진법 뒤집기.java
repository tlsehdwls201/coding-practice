import java.util.*;
class Solution {
    public int solution(int n) {
        int answer = 0;
        List<Integer> l = new ArrayList<>();
        int x = 0;
        while(true) {
            if(Math.pow(3,x) > n) {
               
                break;
            }
            else
                x++;
        }
        int arr[] = new int[x];
        int brr[] = new int[x];
        
        int nn = n;
        for(int i = arr.length-1; i >= 0; i--) {
            int c = 0;
            if(nn == 0) break;
            while(true) { 
                if(Math.pow(3, i)*(c) >= nn) {
                    if(Math.pow(3, i) * c == nn) {
                        arr[arr.length-1-i] = c;
                        nn -= Math.pow(3, i) * c;
                        break;
                    }
                    else {
                    	nn-=Math.pow(3, i)*(c-1);
                    	arr[arr.length-1-i] = c-1;
                    }
                    break;
                }
                else c++;  
            }
           
        }
        System.out.println(Arrays.toString(arr));
        
        for(int i = 0; i < brr.length; i++) {
            brr[i] = arr[arr.length-1-i];
        }
        
        for(int i = 0; i < brr.length; i++) {
            answer += Math.pow(3, brr.length-1-i) * brr[i];
        }
        
        
        return answer;
    }
}