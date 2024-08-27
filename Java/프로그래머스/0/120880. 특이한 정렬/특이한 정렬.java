class Solution {
    public int[] solution(int[] numlist, int n) {
        // 결과를 저장할 배열 생성
        int[] result = new int[numlist.length];
        
        // 각 원소와 기준값 n의 차이 절대값을 저장할 배열 생성
        int[] distance = new int[numlist.length];
        
        // 각 원소와 n의 차이를 절대값으로 계산하여 distance 배열에 저장
        for (int i = 0; i < numlist.length; i++) {
            distance[i] = Math.abs(n - numlist[i]);
        }
        
        int resultIndex = 0; // 결과 배열의 현재 인덱스
        
        // 각 원소를 처리하여 결과 배열에 순서대로 추가
        for (int i = 0; i < distance.length; i++) {
            int minDis = Integer.MAX_VALUE; // 현재 최소 거리
            int idx = -1; // 현재 최소 거리의 인덱스
            
            // 거리 배열을 순회하여 최소 거리와 해당 인덱스를 찾기
            for (int j = 0; j < distance.length; j++) {
                if (distance[j] == -1) continue; // 이미 처리된 원소는 건너뛰기
                
                // 현재 거리보다 작으면 업데이트
                if (minDis > distance[j]) {
                    minDis = distance[j];
                    idx = j;
                } 
                // 현재 거리와 같고, 해당 원소가 더 크면 업데이트
                else if (minDis == distance[j] && numlist[idx] < numlist[j]){
                    minDis = distance[j];
                    idx = j;
                }
            }
            
            // 선택된 원소의 거리를 -1로 설정하여 중복 방지
            distance[idx] = -1;
            result[resultIndex++] = numlist[idx]; // 결과 배열에 추가
        }
        
        return result; // 최종 결과 배열 반환
    }
}