class Solution {
    public int solution(int[] numbers) {

       int[] max = {-1, -1};
        for(int i = 0; i < numbers.length ; i++){
            if(numbers[i] < max[1]){
                continue;
            }
            
            if(numbers[i] > max[0]){
                max[1] =max[0];
                max[0] = numbers[i];
                
                continue;
            }
            
            if(numbers[i] > max[1]){
                max[1] = numbers[i];
            }
        }
        return max[0] * max[1];
    }
}