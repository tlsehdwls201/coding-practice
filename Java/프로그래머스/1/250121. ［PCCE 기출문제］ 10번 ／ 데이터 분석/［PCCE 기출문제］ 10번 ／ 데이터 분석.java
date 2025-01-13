import java.util.*;
class Solution {
    public List<int[]> solution(int[][] data, String ext, int val_ext, String sort_by) {
        //int[][] answer = {};
        String keward[] = {"code", "date", "maximum", "remain"};
        int ext_num = 0;
        int sort_num = 0;
        List<int []> l = new ArrayList<>();
        for(int i = 0; i < keward.length; i++) {
            if(ext.equals(keward[i])) ext_num = i;
            if(sort_by.equals(keward[i])) sort_num = i;
        }
        
        for(int i = 0; i < data.length; i++) {
            if(data[i][ext_num] < val_ext) l.add(data[i]);
        }
        
        final int index = sort_num;
        Collections.sort(l, (i1, i2) -> i1[index] - i2[index]);
        
        return l;
    }
}