class Solution {
    public int[] solution(int[] numlist, int n) {
        
        
        int length = numlist.length;
        for(int i = 0; i < length - 1; i++) {
            for(int j = i+1; j < length; j++) {
                int a = (numlist[j] - n) * (numlist[j] > n ? 1 : -1);
                int b = (numlist[i] - n) * (numlist[i] > n ? 1 : -1);
                
                if(a < b || (a == b && numlist[j] > numlist[i])) {
                    int temp = numlist[j];
                    numlist[j] = numlist[i];
                    numlist[i] = temp;
                }
                    
            }
        }
        return numlist;
    }
}