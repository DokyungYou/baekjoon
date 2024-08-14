class Solution {
    public int[] solution(int num, int total) {
        int[] answer = new int[num];
        
        int maxSum = 0;
        for(int i = 0; i < num; i++){
            maxSum += total-i;
        }
        int maxNum = total - ((maxSum - total) / num);
        
        for(int i = num - 1; i >= 0; i--){
            answer[i] = maxNum--;
        }
        
        return answer;
    }
}