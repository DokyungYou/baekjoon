class Solution {
    public int solution(int n) {
       int count = 0;
        for(int i = 4; i <= n ; i++){ //  합성수의 가장 작은 수부터 시작
             for(int j = 2; j < i ; j++){
                if(i % j == 0){
                    count++;
                    break;
                }
            }
        }
       return count;
    }
}