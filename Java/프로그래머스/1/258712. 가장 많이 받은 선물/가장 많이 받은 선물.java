import java.util.*;

class Solution {
    public int solution(String[] friends, String[] gifts) {
        // key : 이름, value : friends 배열의 index
        // giftIndex, recode의 index(식별자 역할)를 파악하기 위한 HashMap
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < friends.length; i++) {
            map.put(friends[i], i);
        }
        
        // 선물 지수 저장 배열
        // map에 저장된 index를 활용하여 선물 지수 저장
        int[] giftIndex = new int[friends.length];
        
        // 친구마다 선물 준 횟수를 저장하는 2차원 배열
        // (ex : 0번째 친구는 1,2,3,4에게, 1번째 친구는 0,2,3,4에게 준 횟수 카운트)
        int[][] recode = new int[friends.length][friends.length];
        
        // 선물 지수 및 선물 주고받은 횟수 저장
        for (int i = 0; i < gifts.length; i++) {
            // 0번째는 선물 한 친구 이름, 1번째는 선물 받은 친구 이름
            String[] gift = gifts[i].split(" ");
            
            // 선물 지수 증가 (선물 한 친구)
            giftIndex[map.get(gift[0])]++;
            // 선물 지수 감소 (선물 받은 친구)
            giftIndex[map.get(gift[1])]--;
            
            // 선물 주고받은 횟수 저장
            recode[map.get(gift[0])][map.get(gift[1])]++;
        }
        
        // 다음 달에 가장 많은 선물을 받는 친구의 최대 선물 수 저장 변수
        int result = 0;
        
        // 각 친구가 다음 달에 받을 선물 수 계산
        for (int i = 0; i < friends.length; i++) {
            // i번째 친구가 받을 선물 수 초기화
            int cnt = 0;
            // 모든 친구들과 비교하여 선물 수 계산
            for (int j = 0; j < friends.length; j++) {
                // 자기 자신과 비교하는 경우 건너뜀
                if (i == j) continue;
                
                // i가 j에게 준 선물이 j가 i에게 준 선물보다 많을 때 cnt 증가
                if (recode[i][j] > recode[j][i]) cnt++;
                // i와 j가 서로 똑같이 주거나 주지는 않았지만 i의 선물 지수가 더 높을 때 cnt 증가
                else if (recode[i][j] == recode[j][i] && giftIndex[i] > giftIndex[j]) cnt++;
            }
            
            // 최대 선물 수 갱신
            result = Math.max(result, cnt);
        }
        
        return result;
    }
}