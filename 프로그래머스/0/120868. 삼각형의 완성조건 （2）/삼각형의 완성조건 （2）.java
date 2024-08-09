class Solution {
    public int solution(int[] sides) {

        int count = 0;
        
        // 배열 안에 가장 긴 선분이 있는경우 (max로 지칭, 다른 선분을 another로 지칭)
        // 새로 들어올 수 있는 수는 [max 이하] [another + x > max]
        int max = Math.max(sides[0], sides[1]);
        int another = Math.min(sides[0], sides[1]);
        
        // max - ((max+1)-another) + 1
        for(int i = (max+1) - another; i <= max; i++){
            count++;
        }
        
        // 새로 추가할 선분이 가장 긴 변일 경우
        // sides[0] + sides[1] > x <= sides 중 더 큰 수
        for(int i = max+1; i < (max + another); i++){
            count++;
        }
        
        return count;
    }
}