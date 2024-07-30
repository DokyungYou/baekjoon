class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        
        int max = -1;
        int sum = 0;
        for(int i = 0; i < 3 ; i++){
            if(sides[i] > max){
                max = sides[i];
            }
            sum += sides[i];
        }
        
        answer = (sum - max) > max ? 1 : 2;
        return answer;
    }
}