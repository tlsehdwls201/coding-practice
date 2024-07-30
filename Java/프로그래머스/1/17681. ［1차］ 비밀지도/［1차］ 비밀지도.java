class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        for(int i = 0; i < n; i++) {
            String a = Integer.toBinaryString(arr1[i]);
            String b = Integer.toBinaryString(arr2[i]);
            int x = Integer.parseInt(a, 2);
            int y = Integer.parseInt(b, 2);
            String c = String.format("%" +  + n + "s",Integer.toBinaryString(x | y));
            System.out.println(c);
            String c1[] = c.split("");
            String result = "";
            for(int j = 0; j < c1.length; j++) {
                if(c1[j].equals("1"))
                    result += "#";
                else 
                    result += " ";
            }
            answer[i] = result;
            result = "";
        }
        return answer;
    }
}