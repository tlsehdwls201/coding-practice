import java.util.*;

class Solution {
    public List<int[]> solution(int[][] data, String ext, int val_ext, String sort_by) {
        String[] category={"code","date","maximum","remain"};    // 데이터 카테고리를 저장
        int categoryNum=0;                                       // 어떤 카테고리를 기준으로 하는지 저장하는 변수
        int sortbyNum=0;                                         // 어떤 카테고리값으로 정렬을 하는지 저장하는 변수
        
        List<int[]> changeData = new ArrayList<>();              // 정렬이 된 데이터들을 담을 변수
        
       for(int i = 0; i < category.length; i++){
            if(ext.equals(category[i]))   categoryNum = i;      // 기준 카테고리 저장    
            if(sort_by.equals(category[i]))  sortbyNum = i;     // 정렬 카테고리 저장
        }
        
    
        for(int i=0; i<data.length; i++){
            if(data[i][categoryNum]<val_ext) changeData.add(data[i]);   // 기준에 맞는 데이터들을 담음
        }
        
        final int cnt=sortbyNum;      // 정렬 카테고리 순번을 Collrection 사용하기 위해 final 변수로 변경
        //Collections.sort(changeData, Comparator.comparingInt(arr -> arr[cnt]));    // 컴팩터를 이용한 방식 (객체로 비교)
        Collections.sort(changeData, (a1, a2) -> a1[cnt] - a2[cnt]);                 // 일반 컴팩터를 이용한 방식(요소로 비교)
       
        return changeData;
    }
}
