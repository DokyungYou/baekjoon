class Solution {
    public int solution(int hp) {
 
        int cnt = 0;

        // 굳이 반복문이나 조건문이 필요없다.

        cnt += hp / 5; // 미만이라면, cnt += 0 , hp는 기존 수 유지
        hp %= 5;
        
        cnt += hp / 3; 
        hp %= 3;
        
        cnt += hp / 1; 
        hp %= 1;


        return cnt;
    }
}